package com.example.pratheekvoona.railroad;

public class CourseOffering {
    private int CRN;
    private String semester;
    private String instructorName;

    public CourseOffering(int CRN, String semester, String instructorName) {
        this.CRN = CRN;
        this.semester = semester;
        this.instructorName = instructorName;
    }

    public int getCRN() {
        return CRN;
    }

    public void setCRN(int CRN) {
        this.CRN = CRN;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
}
