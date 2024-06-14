package sumago.androidipt.b1recyclerview;

public class User {
    String name;
    int age;
    int rollNo;
    int imageId;

    public User(String name, int age, int rollNo, int imageId) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.imageId = imageId;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
