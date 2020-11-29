package studentProblems;

public class ResizingArray {
    private Student[] studentsArr;

//    Armen, Sona, Valod, Mxo, null, null

    public ResizingArray(int size) {
        studentsArr = new Student[size];
    }

    public void addElement(Student student) {
        if (!isFull()) {
            studentsArr[getFirstEmptyElementIndex()] = student;
        } else {
            Student[] newStudentsArr = new Student[studentsArr.length * 2];
            for (int i = 0; i < studentsArr.length; i++) {
                newStudentsArr[i] = studentsArr[i];
            }
            studentsArr = newStudentsArr;
            newStudentsArr[getFirstEmptyElementIndex()] = student;

        }
    }

    public void removeElement(Student student) {
        for (int i = 0; i < getLength(); i++) {
            if (studentsArr[i].equals(student)) {
                studentsArr[i] = null;
            }
        }
        correctStudentsArr();

        if (isNeedShorten()) {
            Student[] shortArr = new Student[studentsArr.length/2];
            for (int i = 0; i < shortArr.length; i++) {
                shortArr[i] = studentsArr[i];
            }
            studentsArr = shortArr;
        }
    }

    public boolean isNeedShorten() {
        if (getFirstEmptyElementIndex() != -1 && getFirstEmptyElementIndex() <= studentsArr.length / 3) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (getFirstEmptyElementIndex() == -1) {
            return true;
        }
        return false;
    }

    //    Armen, Sona, null, null, null

    public int getFirstEmptyElementIndex() {
        for (int i = 0; i < studentsArr.length; i++) {
            if (studentsArr[i] == null) {
                return i;
            }
        }
        return -1;
    }

    private void correctStudentsArr() {
        if(getFirstEmptyElementIndex() != -1){
            for (int i = getFirstEmptyElementIndex(); i < studentsArr.length; i++) {
                if (studentsArr[i] != null){
                    studentsArr[getFirstEmptyElementIndex()] = studentsArr[i];
                    studentsArr[i] = null;
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < studentsArr.length; i++) {
            if (studentsArr[i] != null) {
                System.out.println(studentsArr[i].getName());
            } else {
                System.out.println("Nullllll");
            }
        }
    }

    public int getLength(){
        int length = 0;
        for (int i = 0; i < studentsArr.length; i++) {
            if(studentsArr[i] != null){
                length++;
            }
        }
       return length;
    }

    public Student getStudentByIndex(int index){
        return studentsArr[index];
    }
    public Student setStudentByIndex(int index, Student student){
        return studentsArr[index] = student;
    }


}
