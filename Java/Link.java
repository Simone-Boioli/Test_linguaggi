class Link {
	public int iData;
	public Link next;

	public Link(int id, Link newNext) {
		iData = id;
		next = newNext;
	}

	public void displayLink() {
		System.out.print(iData);
	}
}
class Test {
	public static void main(String args[]) {
		Link link = new Link(0, null);
		Link start = new Link(0, link);
		for (int i = 0; i < 5; i++) {
			link = new Link(i, link);
		}
		for (int j = 0; j < 5; j++) {
			start = start.next;
		}
		start.displayLink();
	}
}