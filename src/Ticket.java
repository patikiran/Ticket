public class Ticket {
    public String name;
    public String time;
    public String rowNo;
    public int seatnumber;

    public Ticket(String name, String time, String rowNo, int seatnumber) {
        this.name = name;
        this.time = time;
        this.rowNo = rowNo;
        this.seatnumber = seatnumber;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", rowNo='" + rowNo + '\'' +
                ", seatnumber=" + seatnumber +
                '}';
    }
}
