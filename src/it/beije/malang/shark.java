package it.beije.malang;

		public class shark extends Fish {
		private int numberOfFins = 8;
		public shark(int age) {
		super(age);
		this.size = 4;
				}
		public static void main(String[] args){
			shark s = new shark(5);
			System.out.println(s.size);
			Fish f = new Fish(5);
			System.out.println(f.size);
		
		}
}
		class Fish {
			protected int size;
			private int age;
			public Fish(int age) {
			this.age = age;
			}
			public int getAge() {
			return age;
			}
			}
		
		
		