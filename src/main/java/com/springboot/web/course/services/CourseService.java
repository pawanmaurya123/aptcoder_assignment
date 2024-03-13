package com.springboot.web.course.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.springboot.web.course.entities.Course;
@Component
public class CourseService {
    private  List<Course> list = new ArrayList<>();

    // static{
    //     list.add(new Course(6,"b2","bio",10,"personalised","self-mode"));
    // }
    //get all courses 
    public List<Course> getAllcourses(){
        return list;
    }

    
    //adding the course
    public Course addCourse(Course c){
        list.add(c);
        return c;
    }


    //Updatethebook
    public void updateCourse(Course course , int courseId){
       list = list.stream().map(c->{
            if(c.getCourseId() == courseId){
                c.setCourseName(course.getCourseName());
                c.setSubject(course.getSubject());
                c.setNoofchapters(course.getNoofchapters());
                c.setTypes(course.getTypes());
                c.setLearnmode(course.getLearnmode());
            }   

            return c;
        }).collect(Collectors.toList());
    }

}
