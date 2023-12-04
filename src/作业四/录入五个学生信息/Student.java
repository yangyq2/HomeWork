package 作业四.录入五个学生信息;

public class Student implements Comparable<Student>{
    private String name;
    public Student() {
    }

    private int chineseScore;
    private int mathScore;
    private int englishScore;
    private int totalScore;

    public Student(String name, int ChineseScore, int mathScore, int englishScore) {
        this.name = name;
        this.chineseScore = ChineseScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
        this.totalScore = ChineseScore+mathScore+englishScore;//求出学生三门课程的总成绩
    }

    @Override
    public String toString() {
        return "学生{" +
                "姓名='" + name + '\'' +
                ", 语文成绩=" + chineseScore +
                ", 数学成绩=" + mathScore +
                ", 英语成绩=" + englishScore +
                '}';
    }
    @Override
    public int compareTo(Student o) {
        if (this.totalScore!=o.totalScore){
            return o.totalScore - this.totalScore;
        } else if (this.chineseScore!=o.chineseScore) {
            return o.chineseScore-this.chineseScore;
        }else if (this.mathScore!=o.mathScore) {
            return o.mathScore-this.mathScore;
        }else if (this.englishScore!=o.englishScore) {
            return o.englishScore-this.englishScore;
        }else{
            return this.name.compareTo(o.name);
        }
    }
}
