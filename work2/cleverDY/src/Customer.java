import java.time.LocalDate;

public class Customer {
    private int times;
    private LocalDate latestArrivedTime;
    private String name;
    public int getTimes() { return times; }

    public void setTimes(int times)  { this.times = times; }

    public LocalDate getLatestArrivedTime() {
        return latestArrivedTime;
    }

    public void setLatestArrivedTime(LocalDate latestArrivedTime) {
        this.latestArrivedTime = latestArrivedTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 成员变量

    private int visitCount;
    private LocalDate latestVisit;

    // 构造方法
    public Customer(String name, int visitCount, LocalDate latestVisit) {
        this.name = name;
        this.visitCount = visitCount;
        this.latestVisit = latestVisit;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }

    public LocalDate getLatestVisit() {
        return latestVisit;
    }

    public void setLatestVisit(LocalDate latestVisit) {
        this.latestVisit = latestVisit;
    }



    // 重写toString方法
    @Override
    public String toString() {
        return "Customer: " + name + ", Visit Count: " + visitCount + ", Latest Visit: " + latestVisit.toString();
    }

}