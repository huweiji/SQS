package mysqs;

public class Message extends Thread{
	public long msgId;
	public String content;
	public int vtime;//visibility time
	public boolean isLocked;
	
	public Message(){
		this.msgId = 0;
		this.content = "";
		this.vtime = 4;//4 seconds
		this.isLocked = false;
	}
	public Message(long msgId){
		this.msgId = msgId;
		this.content = "";
		this.vtime = 4;
		this.isLocked = false;
	}
	public String toString(){
		String info = "";
		info = "class Message: msgId:"+this.msgId
		+" content:"+this.content+" vtime:"+this.vtime
		+" isLocked:"+this.isLocked;
		return info;
	}
	public void setContent(String content){
		this.content = content;
	}
	public void lock(){
		this.isLocked = true;
	}
	public void unlock(){
		this.isLocked = false;
	}
	public void run(){//lock 1000 ms, 1 second
		this.lock();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.unlock();
	}
}
