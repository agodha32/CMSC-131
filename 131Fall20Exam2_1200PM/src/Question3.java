
public class Question3 {

	public static int question3(int[] scores) {

		boolean neagiveOrExtra = false;

		for (int neg = 0; neg < scores.length; neg++) {

			if (scores[neg] < 0 || scores[neg] > 100) {

				neagiveOrExtra = true;

			}

		}

		if (scores.length == 0) {

			throw new IllegalArgumentException("Incorrect Length");

		} else if (neagiveOrExtra == true) {

			throw new IllegalArgumentException("Incorrect Values");

		} else {

			int maxValue = 0, maxCount = 0;

			for (int num = 0; num < scores.length; ++num) {

				int count = 0;

				for (int x = 0; x < scores.length; ++x) {

					if (scores[num] == scores[x]) {

						count++;

					}

				}

				if (count > maxCount) {

					maxCount = count;
					maxValue = scores[num];

				}
			}

			return maxValue;
		}

	}

}
