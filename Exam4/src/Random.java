import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Random {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list = random();
		Map<Integer, List> map = new HashMap<Integer, List>();
		int k = 0;
		List li0 = new ArrayList();
		List li1 = new ArrayList();
		List li2 = new ArrayList();
		List li3 = new ArrayList();
		List li4 = new ArrayList();
		List li5 = new ArrayList();
		List li6 = new ArrayList();
		List li7 = new ArrayList();
		List li8 = new ArrayList();
		List li9 = new ArrayList();
		for (int i = 0; i < list.size(); i++) {
			k = Math.floorDiv((int) list.get(i), 10);
			if (k == 0) {
				li0.add(list.get(i));
			}
			if (k == 1) {
				li1.add(list.get(i));
			}
			if (k == 2) {
				li2.add(list.get(i));
			}
			if (k == 3) {
				li3.add(list.get(i));
			}
			if (k == 4) {
				li4.add(list.get(i));
			}
			if (k == 5) {
				li5.add(list.get(i));
			}
			if (k == 6) {
				li6.add(list.get(i));
			}
			if (k == 7) {
				li7.add(list.get(i));
			}
			if (k == 8) {
				li8.add(list.get(i));
			}
			if (k == 9) {
				li9.add(list.get(i));
			}
		}
		map.put(0, li0);
		map.put(1, li1);
		map.put(2, li2);
		map.put(3, li3);
		map.put(4, li4);
		map.put(5, li5);
		map.put(6, li6);
		map.put(7, li7);
		map.put(8, li8);
		map.put(9, li9);
		System.out.print("Map中的数据为：{");
		for (Iterator it = map.keySet().iterator(); it.hasNext();) {
			int key = (int) it.next();
			List l = map.get(key);
			System.out.print(+key + "=>");
			System.out.print(l.toString() + ",");
		}
		System.out.print("}");
		System.out.println();
		System.out.print("排序后的Map：{");
		for (Iterator it = map.keySet().iterator(); it.hasNext();) {
			int key = (int) it.next();
			List<Integer> l = map.get(key);
			bubbleScort(l);
			System.out.print(+key + "=>");
			System.out.print(l.toString() + ",");
		}
		System.out.print("}");
		// Iterator it = map.keySet().iterator();
		// while(it.hasNext()){
		// int key;
		// int value;
		// key=(int) it.next();
		// value=map.get(key);
		// System.out.println(key+","+value);
		// }
		// for (Entry<Integer, Integer> entry : map.entrySet()) {
		// System.out.println("key="+entry.getKey()+"and
		// value="+entry.getValue());
		// }
	}

	/**
	 * 生成50个随机数
	 * 
	 * @return
	 */
	public static List random() {
		java.util.Random r = new java.util.Random();
		List list = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			int m = r.nextInt(100);
			list.add(m);
		}
		System.out.print("随机生成 50 个小于 100 的数,分别为:");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ",");
		}
		System.out.println();
		return list;
	}

	public static void bubbleScort(List<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 1; j < list.size(); j++) {
				if ((list.get(j-1)).compareTo(list.get(j)) > 0) {
					Integer a = list.get(j-1);
					list.set(j-1, list.get(j));
					list.set(j, a);
				}

			}

		}
	}
}
