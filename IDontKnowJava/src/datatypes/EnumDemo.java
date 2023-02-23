package datatypes;

enum Days{
	MONDAY(101),TUESDAY(102),WEDNESDAY(103),THURSDAY(104),
	FRIDAY(105),SATURDAY(106),SUNDAY(107);
	
	private int dayNo;
	
	public int getDayNo() {
		return dayNo;
	}
	
	public void setDayNo(int dayNo) {
		this.dayNo=dayNo;
	}
	Days(){}
	
	Days(int dayNo){
		this.dayNo=dayNo;
	}
}
public class EnumDemo {
	public static void main(String[] args) {
		
		Days days=Days.SATURDAY;
		
//		System.out.println(days);
//		System.out.println(days.ordinal());
//		System.out.println(days.getDayNo());
//		days.setDayNo(1001);
//		System.out.println(days.getDayNo());
		
		switch(days) {
			case MONDAY:
				System.out.println(days.getDayNo());
				break;
			case TUESDAY:
				System.out.println(days.getDayNo());
				break;
			case WEDNESDAY:
				System.out.println(days.getDayNo());
				break;
			case THURSDAY:
				System.out.println(days.getDayNo());
				break;
			case FRIDAY:
				System.out.println(days.getDayNo());
				break;
			case SATURDAY:
				System.out.println(days.getDayNo());
				break;
			case SUNDAY:
				System.out.println(days.getDayNo());
				break;
		}
		
	}
}
