package file.operations;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import student.marks.StudentMarks;

public class FileOperations {

	public static void main(String[] args) throws Exception {
		Workbook workbook = new XSSFWorkbook();
		System.out.println(workbook.getNumberOfSheets());
		Sheet markSheet = workbook.createSheet("Marks");
		System.out.println(workbook.getNumberOfSheets());
		System.out.println(markSheet.getSheetName());
		Row row1 = markSheet.createRow(0);
		Cell cell1 = row1.createCell(0, CellType.STRING);
		cell1.setCellValue("Student ID");
		Cell cell2 = row1.createCell(1, CellType.STRING);
		cell2.setCellValue("Student Name");
		System.out.println("*********");
		printWorkbook(workbook);
		System.out.println("*********");

		Workbook workbookFromScratch = new XSSFWorkbook();
		workbookFromScratch.createSheet("Marks");
		Sheet sheet = workbookFromScratch.getSheetAt(0);
		StudentMarks s1 = new StudentMarks(1, "Modi");
		StudentMarks s2 = new StudentMarks(2, "Rahul");
		StudentMarks s3 = new StudentMarks(3, "Mamata");
		generateStudentMarks(s1);
		generateStudentMarks(s2);
		generateStudentMarks(s3);
		
		setRow(sheet.createRow(0), s1);
		setRow(sheet.createRow(1), s2);
		setRow(sheet.createRow(2), s3);
		
		printWorkbook(workbookFromScratch);

		// temporary for skipping after this
		if (10 % 2 == 0) {
			System.exit(0);
		}

		Workbook workbook2 = new XSSFWorkbook(new File("C:\\Users\\sreek\\Downloads\\student-marks-09-12.xlsx"));
		printWorkbook(workbook2);
//		File fileNameNew = new File("C:\\Users\\sreek\\Downloads\\student-marks-generated.xlsx");
//		OutputStream stream = new FileOutputStream(fileNameNew);
//		workbook.write(stream);
//		stream.close();
		addRowToSheet(workbook2.getSheetAt(0));
		System.out.println("After edit - from java");
		printWorkbook(workbook2);
		Workbook workbook3 = new XSSFWorkbook(new File("C:\\Users\\sreek\\Downloads\\student-marks-09-12.xlsx"));
		System.out.println("After edit - from file");
		printWorkbook(workbook3);
		try (FileOutputStream fos = new FileOutputStream(
				new File("C:\\Users\\sreek\\Downloads\\student-marks-09-12.xlsx"))) {
			workbook2.write(fos);
		}
		Workbook workbook4 = new XSSFWorkbook(new File("C:\\Users\\sreek\\Downloads\\student-marks-09-12.xlsx"));
		System.out.println("After edit and write - reading from file");
		printWorkbook(workbook4);

		deleteRowFromSheet(workbook2.getSheetAt(0));
		System.out.println("After remove - from java");
		printWorkbook(workbook2);

		Workbook workbook5 = new XSSFWorkbook(new File("C:\\Users\\sreek\\Downloads\\student-marks-09-12.xlsx"));
		System.out.println("After remove - from file");
		printWorkbook(workbook5);

		try (FileOutputStream fos = new FileOutputStream(
				new File("C:\\Users\\sreek\\Downloads\\student-marks-09-12.xlsx"))) {
			workbook2.write(fos);
		}
		Workbook workbook6 = new XSSFWorkbook(new File("C:\\Users\\sreek\\Downloads\\student-marks-09-12.xlsx"));
		System.out.println("After remove and write - read from file");
		printWorkbook(workbook6);
	}

	private static void setRow(Row row, StudentMarks obj) {
		Cell cell1 = row.createCell(0, CellType.NUMERIC);
		cell1.setCellValue(obj.getId());
		Cell cell2 = row.createCell(1, CellType.STRING);
		cell2.setCellValue(obj.getName());
	}

	private static void deleteRowFromSheet(Sheet sheet) {
		sheet.removeRow(sheet.getRow(3));
	}

	private static void addRowToSheet(Sheet sheet) {
		int rowSize = sheet.getPhysicalNumberOfRows();
		Row row = sheet.createRow(rowSize);
		Cell cell1 = row.createCell(0, CellType.NUMERIC);
		cell1.setCellValue(6);
		Cell cell2 = row.createCell(1, CellType.STRING);
		cell2.setCellValue("Surya");
	}

	private static void printWorkbook(Workbook workbook) {
		for (Sheet sheet : workbook) {
			for (Row row : sheet) {
				for (Cell cell : row) {
					switch (cell.getCellType()) {
					case FORMULA:
						System.out.print(cell.getCellFormula());
						break;
					case NUMERIC:
						System.out.print(cell.getNumericCellValue());
						break;
					case STRING:
						System.out.print(cell.getStringCellValue());
						break;
					default:
						System.out.print("UNKNOWN");
						break;
					}
					System.out.print("\t\t");
				}
				System.out.println();
			}
		}
	}

	private static void generateStudentMarks(StudentMarks studentMarks) {
		studentMarks.setChemistry(getRandomMark());
		studentMarks.setComputerScience(getRandomMark());
		studentMarks.setEnglish(getRandomMark());
		studentMarks.setMaths(getRandomMark());
		studentMarks.setPhysics(getRandomMark());
		studentMarks.setTamil(getRandomMark());
	}

	private static int getRandomMark() {
		int min = 0;
		int max = 100;
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
	}

}
