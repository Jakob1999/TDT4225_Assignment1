# TDT4250_Assignment1

## Repo strukture and content

[The instance made lies here](emf/model/Course.xmi). 
The constraint made was that semester must be a string that is either equal to ´spring´ or 
´autumn´. [Find the constraint here](emf/src/courses.util/CoursesValidator.java). 



## Inspiration 

We based our model on the page [grades.no](https://grades.no/), which is a page for looking at courses at NTNU, see the grade distribution for course and general information about it. It has a good number of concepts, and the concepts have various relations between them. Se the model  under. It has fixed structures, like the layout of the data and template of the page. But it also has variable structure, which is the specific information in the data, like course name, semester, etc. 
[See screenshot here](grades.png)


## Ecore modelling
See our ecore model here: 


## Example instance 

Lies in "emf/model/Course.xmi", but we also provide it here:
```
<Grades:Course
    xmi:version="2.0"
    xmlns:xmi="http://www.omg.org/XMI"
    xmlns:Grades="Grades.com"
    CourseName="ITGK"
    CourseCode="TDT4110"
    StudyPoints="7.5"
    Level="Low"
    Semester="Spring"
    Language="English"
    CourseContent="This is a cool subject containing IT stuff!"
    LearningOutcome="Python">
  <ExamId ExamId="1"
      Year="2023">
    <GradeId
        GradeId="1"
        A="12"
        B="34"
        C="44"
        D="32"
        E="21"
        F="19"/>
  </ExamId>
  <LinkId LinkId="1"
      CoursePage="www.itgk.nothing"
      CourseQuality="Good"
      StudentEvaluation="I like it"/>
</Grades:Course>
```
