/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author Oltuser06
 */
public class Course {

    String course_id,course_name;
    
        public Course() {
    }

    public Course(String course_id, String course_name) {
        this.course_id = course_id;
        this.course_name = course_name;
      
       
    }

   

    public String getCourseId() {
        return course_id;
    }

    public void setCourseId(String course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

   
}