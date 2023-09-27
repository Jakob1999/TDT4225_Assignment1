/**
 */
package Courses;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Courses.CoursesFactory
 * @model kind="package"
 * @generated
 */
public interface CoursesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Courses";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Grades.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Grades";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoursesPackage eINSTANCE = Courses.impl.CoursesPackageImpl.init();

	/**
	 * The meta object id for the '{@link Courses.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Courses.impl.CourseImpl
	 * @see Courses.impl.CoursesPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 0;

	/**
	 * The feature id for the '<em><b>Course Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Course Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_CODE = 1;

	/**
	 * The feature id for the '<em><b>Study Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__STUDY_POINTS = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__SEMESTER = 4;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LANGUAGE = 5;

	/**
	 * The feature id for the '<em><b>Exam Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__EXAM_ID = 6;

	/**
	 * The feature id for the '<em><b>Course Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_CONTENT = 7;

	/**
	 * The feature id for the '<em><b>Learning Outcome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LEARNING_OUTCOME = 8;

	/**
	 * The feature id for the '<em><b>Link Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LINK_ID = 9;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Courses.impl.ExamsImpl <em>Exams</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Courses.impl.ExamsImpl
	 * @see Courses.impl.CoursesPackageImpl#getExams()
	 * @generated
	 */
	int EXAMS = 1;

	/**
	 * The feature id for the '<em><b>Exam Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMS__EXAM_ID = 0;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMS__YEAR = 1;

	/**
	 * The feature id for the '<em><b>Cont</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMS__CONT = 2;

	/**
	 * The feature id for the '<em><b>Grade Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMS__GRADE_ID = 3;

	/**
	 * The number of structural features of the '<em>Exams</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Exams</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Courses.impl.GradesImpl <em>Grades</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Courses.impl.GradesImpl
	 * @see Courses.impl.CoursesPackageImpl#getGrades()
	 * @generated
	 */
	int GRADES = 2;

	/**
	 * The feature id for the '<em><b>Grade Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADES__GRADE_ID = 0;

	/**
	 * The feature id for the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADES__A = 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADES__B = 2;

	/**
	 * The feature id for the '<em><b>C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADES__C = 3;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADES__D = 4;

	/**
	 * The feature id for the '<em><b>E</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADES__E = 5;

	/**
	 * The feature id for the '<em><b>F</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADES__F = 6;

	/**
	 * The number of structural features of the '<em>Grades</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADES_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Grades</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Courses.impl.LinksImpl <em>Links</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Courses.impl.LinksImpl
	 * @see Courses.impl.CoursesPackageImpl#getLinks()
	 * @generated
	 */
	int LINKS = 3;

	/**
	 * The feature id for the '<em><b>Link Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__LINK_ID = 0;

	/**
	 * The feature id for the '<em><b>Course Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__COURSE_PAGE = 1;

	/**
	 * The feature id for the '<em><b>Course Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__COURSE_QUALITY = 2;

	/**
	 * The feature id for the '<em><b>Student Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__STUDENT_EVALUATION = 3;

	/**
	 * The number of structural features of the '<em>Links</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Links</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Courses.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see Courses.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link Courses.Course#getCourseName <em>Course Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Name</em>'.
	 * @see Courses.Course#getCourseName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseName();

	/**
	 * Returns the meta object for the attribute '{@link Courses.Course#getCourseCode <em>Course Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Code</em>'.
	 * @see Courses.Course#getCourseCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseCode();

	/**
	 * Returns the meta object for the attribute '{@link Courses.Course#getStudyPoints <em>Study Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Study Points</em>'.
	 * @see Courses.Course#getStudyPoints()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_StudyPoints();

	/**
	 * Returns the meta object for the attribute '{@link Courses.Course#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see Courses.Course#getLevel()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Level();

	/**
	 * Returns the meta object for the attribute '{@link Courses.Course#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester</em>'.
	 * @see Courses.Course#getSemester()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Semester();

	/**
	 * Returns the meta object for the attribute '{@link Courses.Course#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see Courses.Course#getLanguage()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Language();

	/**
	 * Returns the meta object for the containment reference list '{@link Courses.Course#getExamId <em>Exam Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exam Id</em>'.
	 * @see Courses.Course#getExamId()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_ExamId();

	/**
	 * Returns the meta object for the attribute '{@link Courses.Course#getCourseContent <em>Course Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Content</em>'.
	 * @see Courses.Course#getCourseContent()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseContent();

	/**
	 * Returns the meta object for the attribute '{@link Courses.Course#getLearningOutcome <em>Learning Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Learning Outcome</em>'.
	 * @see Courses.Course#getLearningOutcome()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_LearningOutcome();

	/**
	 * Returns the meta object for the containment reference '{@link Courses.Course#getLinkId <em>Link Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link Id</em>'.
	 * @see Courses.Course#getLinkId()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_LinkId();

	/**
	 * Returns the meta object for class '{@link Courses.Exams <em>Exams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exams</em>'.
	 * @see Courses.Exams
	 * @generated
	 */
	EClass getExams();

	/**
	 * Returns the meta object for the attribute '{@link Courses.Exams#getExamId <em>Exam Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exam Id</em>'.
	 * @see Courses.Exams#getExamId()
	 * @see #getExams()
	 * @generated
	 */
	EAttribute getExams_ExamId();

	/**
	 * Returns the meta object for the attribute '{@link Courses.Exams#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see Courses.Exams#getYear()
	 * @see #getExams()
	 * @generated
	 */
	EAttribute getExams_Year();

	/**
	 * Returns the meta object for the attribute '{@link Courses.Exams#isCont <em>Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cont</em>'.
	 * @see Courses.Exams#isCont()
	 * @see #getExams()
	 * @generated
	 */
	EAttribute getExams_Cont();

	/**
	 * Returns the meta object for the containment reference '{@link Courses.Exams#getGradeId <em>Grade Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Grade Id</em>'.
	 * @see Courses.Exams#getGradeId()
	 * @see #getExams()
	 * @generated
	 */
	EReference getExams_GradeId();

	/**
	 * Returns the meta object for class '{@link Courses.Grades <em>Grades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grades</em>'.
	 * @see Courses.Grades
	 * @generated
	 */
	EClass getGrades();

	/**
	 * Returns the meta object for the attribute '{@link Courses.Grades#getGradeId <em>Grade Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade Id</em>'.
	 * @see Courses.Grades#getGradeId()
	 * @see #getGrades()
	 * @generated
	 */
	EAttribute getGrades_GradeId();

	/**
	 * Returns the meta object for the attribute '{@link Courses.Grades#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A</em>'.
	 * @see Courses.Grades#getA()
	 * @see #getGrades()
	 * @generated
	 */
	EAttribute getGrades_A();

	/**
	 * Returns the meta object for the attribute '{@link Courses.Grades#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see Courses.Grades#getB()
	 * @see #getGrades()
	 * @generated
	 */
	EAttribute getGrades_B();

	/**
	 * Returns the meta object for the attribute '{@link Courses.Grades#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C</em>'.
	 * @see Courses.Grades#getC()
	 * @see #getGrades()
	 * @generated
	 */
	EAttribute getGrades_C();

	/**
	 * Returns the meta object for the attribute '{@link Courses.Grades#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see Courses.Grades#getD()
	 * @see #getGrades()
	 * @generated
	 */
	EAttribute getGrades_D();

	/**
	 * Returns the meta object for the attribute '{@link Courses.Grades#getE <em>E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E</em>'.
	 * @see Courses.Grades#getE()
	 * @see #getGrades()
	 * @generated
	 */
	EAttribute getGrades_E();

	/**
	 * Returns the meta object for the attribute '{@link Courses.Grades#getF <em>F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>F</em>'.
	 * @see Courses.Grades#getF()
	 * @see #getGrades()
	 * @generated
	 */
	EAttribute getGrades_F();

	/**
	 * Returns the meta object for class '{@link Courses.Links <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Links</em>'.
	 * @see Courses.Links
	 * @generated
	 */
	EClass getLinks();

	/**
	 * Returns the meta object for the attribute '{@link Courses.Links#getLinkId <em>Link Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Id</em>'.
	 * @see Courses.Links#getLinkId()
	 * @see #getLinks()
	 * @generated
	 */
	EAttribute getLinks_LinkId();

	/**
	 * Returns the meta object for the attribute '{@link Courses.Links#getCoursePage <em>Course Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Page</em>'.
	 * @see Courses.Links#getCoursePage()
	 * @see #getLinks()
	 * @generated
	 */
	EAttribute getLinks_CoursePage();

	/**
	 * Returns the meta object for the attribute '{@link Courses.Links#getCourseQuality <em>Course Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Quality</em>'.
	 * @see Courses.Links#getCourseQuality()
	 * @see #getLinks()
	 * @generated
	 */
	EAttribute getLinks_CourseQuality();

	/**
	 * Returns the meta object for the attribute '{@link Courses.Links#getStudentEvaluation <em>Student Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Student Evaluation</em>'.
	 * @see Courses.Links#getStudentEvaluation()
	 * @see #getLinks()
	 * @generated
	 */
	EAttribute getLinks_StudentEvaluation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoursesFactory getCoursesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Courses.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Courses.impl.CourseImpl
		 * @see Courses.impl.CoursesPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Course Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_NAME = eINSTANCE.getCourse_CourseName();

		/**
		 * The meta object literal for the '<em><b>Course Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_CODE = eINSTANCE.getCourse_CourseCode();

		/**
		 * The meta object literal for the '<em><b>Study Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__STUDY_POINTS = eINSTANCE.getCourse_StudyPoints();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LEVEL = eINSTANCE.getCourse_Level();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__SEMESTER = eINSTANCE.getCourse_Semester();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LANGUAGE = eINSTANCE.getCourse_Language();

		/**
		 * The meta object literal for the '<em><b>Exam Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__EXAM_ID = eINSTANCE.getCourse_ExamId();

		/**
		 * The meta object literal for the '<em><b>Course Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_CONTENT = eINSTANCE.getCourse_CourseContent();

		/**
		 * The meta object literal for the '<em><b>Learning Outcome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LEARNING_OUTCOME = eINSTANCE.getCourse_LearningOutcome();

		/**
		 * The meta object literal for the '<em><b>Link Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__LINK_ID = eINSTANCE.getCourse_LinkId();

		/**
		 * The meta object literal for the '{@link Courses.impl.ExamsImpl <em>Exams</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Courses.impl.ExamsImpl
		 * @see Courses.impl.CoursesPackageImpl#getExams()
		 * @generated
		 */
		EClass EXAMS = eINSTANCE.getExams();

		/**
		 * The meta object literal for the '<em><b>Exam Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMS__EXAM_ID = eINSTANCE.getExams_ExamId();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMS__YEAR = eINSTANCE.getExams_Year();

		/**
		 * The meta object literal for the '<em><b>Cont</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMS__CONT = eINSTANCE.getExams_Cont();

		/**
		 * The meta object literal for the '<em><b>Grade Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMS__GRADE_ID = eINSTANCE.getExams_GradeId();

		/**
		 * The meta object literal for the '{@link Courses.impl.GradesImpl <em>Grades</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Courses.impl.GradesImpl
		 * @see Courses.impl.CoursesPackageImpl#getGrades()
		 * @generated
		 */
		EClass GRADES = eINSTANCE.getGrades();

		/**
		 * The meta object literal for the '<em><b>Grade Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADES__GRADE_ID = eINSTANCE.getGrades_GradeId();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADES__A = eINSTANCE.getGrades_A();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADES__B = eINSTANCE.getGrades_B();

		/**
		 * The meta object literal for the '<em><b>C</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADES__C = eINSTANCE.getGrades_C();

		/**
		 * The meta object literal for the '<em><b>D</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADES__D = eINSTANCE.getGrades_D();

		/**
		 * The meta object literal for the '<em><b>E</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADES__E = eINSTANCE.getGrades_E();

		/**
		 * The meta object literal for the '<em><b>F</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADES__F = eINSTANCE.getGrades_F();

		/**
		 * The meta object literal for the '{@link Courses.impl.LinksImpl <em>Links</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Courses.impl.LinksImpl
		 * @see Courses.impl.CoursesPackageImpl#getLinks()
		 * @generated
		 */
		EClass LINKS = eINSTANCE.getLinks();

		/**
		 * The meta object literal for the '<em><b>Link Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINKS__LINK_ID = eINSTANCE.getLinks_LinkId();

		/**
		 * The meta object literal for the '<em><b>Course Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINKS__COURSE_PAGE = eINSTANCE.getLinks_CoursePage();

		/**
		 * The meta object literal for the '<em><b>Course Quality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINKS__COURSE_QUALITY = eINSTANCE.getLinks_CourseQuality();

		/**
		 * The meta object literal for the '<em><b>Student Evaluation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINKS__STUDENT_EVALUATION = eINSTANCE.getLinks_StudentEvaluation();

	}

} //CoursesPackage
