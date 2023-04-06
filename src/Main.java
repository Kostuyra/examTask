import java.util.Arrays;

public class Main {
//	- Задача
// Необходимо реализовать следующий метод:
// 1. Получаем на входе массив чисел.
// 2. Все четные числа увеличиваем на единицу.
// 3. Возвращаем кусок списка с 3-го по 7-й элемент.

	public static void main(String[] args) {
		int[] array = {3,4,8,9,12,5,3,77,11,2,3,33};
		System.out.println(Arrays.toString(returnArraySlice(array)));
	}

	static int[] returnArraySlice(int[] arrayNumbers) {
		for (int i = 0; i < arrayNumbers.length; i++) {
			if (arrayNumbers[i] % 2 == 0) {
				arrayNumbers[i] += 1;
			}
		}

		int [] slice = Arrays.copyOfRange(arrayNumbers, 2, 7);
		return slice;
	}


}

