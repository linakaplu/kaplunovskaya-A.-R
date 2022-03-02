package zadan3;

public class zadan3 {
		public static void main(String[] args) {
			if (args.length != 2) {
				System.out.println("Íåâåðíîå êîëè÷åñòâî ïàðàìåòðîâ");
				return;
				}
			System.out.println(args[0] + " + " + args[1] + " = " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
			}		

}
