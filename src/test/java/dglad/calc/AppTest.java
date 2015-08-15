package dglad.calc;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AppTest {

	private String[] args = null;
	private List<String> answers = null;

	@BeforeClass
	private void init() {
		args = new String[]{
				"3 2",
				"A2",
				"4 5 *",
				"A1",
				"A1 B2 / 2 +",
				"3",
				"39 B1 B2 * /"
		};
		answers = new ArrayList<>();
		answers.add("20.00000");
		answers.add("20.00000");
		answers.add("20.00000");
		answers.add("8.66667");
		answers.add("3.00000");
		answers.add("1.50000");
	}

	@Test
	public void testCalcSpreadsheet() {
		List<Double> results = App.calcSpreadsheet(args);
		for (int i = 0; i < 6; i++) {
			Assert.assertEquals(answers.get(i), String.format("%.5f", results.get(i)));
		}
	}
}
