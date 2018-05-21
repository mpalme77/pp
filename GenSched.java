import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class GenSched {
	public static void main(String[] args) {
		try {
			ppSched();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void ppSched() {

		try {
			Scanner a = new Scanner(System.in);
			Scanner num = new Scanner(System.in);

			int tempTskCtr = 0;
			int tempPrio = 1;
			String tempdesc;
			String tempTS;
			String tempTE;
			double tempdu;

			ProjectPlan pp = new ProjectPlan();
			System.out.println("Enter project plan name:");
			pp.setDescription(a.nextLine());

			System.out.println("Enter number of tasks for this project plan:");
			tempTskCtr = num.nextInt();
			pp.setTaskCtr(tempTskCtr);

			Calendar cal = Calendar.getInstance();
			SimpleDateFormat dateFormatter = new SimpleDateFormat(
					"MMMM dd, yyyy");

			List<Tasks> tList = new ArrayList<Tasks>();

			for (int z = 0; z < tempTskCtr; z++) {

				tempdu = 0.0;
				tempdesc = null;
				tempTS = null;
				tempTE = null;
				System.out.println("Enter description for task #" + tempPrio
						+ ":");
				tempdesc = a.nextLine();

				System.out.println("Enter duration of this task in days:");
				tempdu = num.nextDouble();

				cal.add(Calendar.DAY_OF_YEAR, 1);
				tempTS = dateFormatter.format(cal.getTime());
				cal.add(Calendar.DAY_OF_YEAR, (int) Math.round(tempdu) - 1);
				tempTE = dateFormatter.format(cal.getTime());

				tList.add(new Tasks(tempdesc, tempdu, tempPrio, tempTS, tempTE));

				tempPrio++;
			}
			pp.settList(tList);
			num.close();
			a.close();

			System.out
					.println(pp.getDescription().toUpperCase() + " SCHEDULE:");
			System.out
					.println("Task No.:  Task Description:              Task Duration:       Start Date:         End Date:          ");
			for (Tasks b : tList) {
				System.out.println(LPad(
						"#" + String.valueOf(b.getPrioritization()), 11, ' ')
						+ LPad(b.getTaskDescription(), 30, ' ')
						+ RPad(String.valueOf(b.getDuration()), 15, ' ')
						+ RPad(b.getStartDate(), 20, ' ')
						+ RPad(b.getEndDate(), 20, ' '));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static String LPad(String str, Integer length, char x) {
		return str
				+ String.format("%" + (length - str.length()) + "s", "")
						.replace(" ", String.valueOf(x));
	}

	public static String RPad(String str, Integer length, char x) {
		return String.format("%" + (length - str.length()) + "s", "").replace(
				" ", String.valueOf(x))
				+ str;
	}

}
