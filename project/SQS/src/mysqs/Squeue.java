package mysqs;

public class Squeue {
	//final: 最终变量，即常量
	private static final int SIZE = 8;
	private int maxsize;
	public String name;
	public int front;
	public int rear;
	public int count;
	public Message queue[];
	
	public Squeue(){
		this.maxsize = SIZE;
		this.name = "Unknow";
		this.front = 0;
		this.rear = 0;
		this.count = 0;
		this.queue = new Message[SIZE];
	}
	public Squeue(String name){
		this.maxsize = SIZE;
		this.name = name;
		this.front = 0;
		this.rear = 0;
		this.count = 0;
		this.queue = new Message[SIZE];
	}
	public String toString(){
		String info = "";
		info = "Squeue name:"+this.name
		+" front:"+this.front+" rear:"+this.rear
		+" count:"+this.count+"\n";
		info += "[";
		for(int i=0;i<this.maxsize;i++){
			info += queue[i]+",";
		}
		info += "]";
		return info;
	}
	public boolean isEmpty(){
		boolean flag = false;
		if(this.count == 0){
			flag = true;
		}
		return flag;
	}
	public boolean isFull(){
		boolean flag = false;
		if(this.count == this.maxsize){
			flag = true;
		}
		return flag;
	}
	public int getLength(){
		return this.count;
	}
	public boolean push(Message msg){
		boolean flag = false;
		//to do
		return flag;
	}
	
}
