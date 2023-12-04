package 实验四.HashMap_TreeMap;

public class Student{
    private String name;
    private int age;
    private int Score;
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, int Score) {
        this.name = name;
        this.age = age;
        this.Score = Score;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    @Override
    public String toString() {
        return name + "\t年龄:" + age+ "\t成绩："+Score;
    }

}
