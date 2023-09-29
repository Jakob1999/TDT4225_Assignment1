/**
 */
package Courses;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Courses.Course#getCourseName <em>Course Name</em>}</li>
 *   <li>{@link Courses.Course#getCourseCode <em>Course Code</em>}</li>
 *   <li>{@link Courses.Course#getStudyPoints <em>Study Points</em>}</li>
 *   <li>{@link Courses.Course#getLevel <em>Level</em>}</li>
 *   <li>{@link Courses.Course#getSemester <em>Semester</em>}</li>
 *   <li>{@link Courses.Course#getLanguage <em>Language</em>}</li>
 *   <li>{@link Courses.Course#getExamId <em>Exam Id</em>}</li>
 *   <li>{@link Courses.Course#getCourseContent <em>Course Content</em>}</li>
 *   <li>{@link Courses.Course#getLearningOutcome <em>Learning Outcome</em>}</li>
 *   <li>{@link Courses.Course#getLinkId <em>Link Id</em>}</li>
 * </ul>
 *
 * @see Courses.CoursesPackage#getCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='semesterName'"
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Course Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Name</em>' attribute.
	 * @see #setCourseName(String)
	 * @see Courses.CoursesPackage#getCourse_CourseName()
	 * @model
	 * @generated
	 */
	String getCourseName();

	/**
	 * Sets the value of the '{@link Courses.Course#getCourseName <em>Course Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Name</em>' attribute.
	 * @see #getCourseName()
	 * @generated
	 */
	void setCourseName(String value);

	/**
	 * Returns the value of the '<em><b>Course Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Code</em>' attribute.
	 * @see #setCourseCode(String)
	 * @see Courses.CoursesPackage#getCourse_CourseCode()
	 * @model id="true"
	 * @generated
	 */
	String getCourseCode();

	/**
	 * Sets the value of the '{@link Courses.Course#getCourseCode <em>Course Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Code</em>' attribute.
	 * @see #getCourseCode()
	 * @generated
	 */
	void setCourseCode(String value);

	/**
	 * Returns the value of the '<em><b>Study Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Points</em>' attribute.
	 * @see #setStudyPoints(float)
	 * @see Courses.CoursesPackage#getCourse_StudyPoints()
	 * @model
	 * @generated
	 */
	float getStudyPoints();

	/**
	 * Sets the value of the '{@link Courses.Course#getStudyPoints <em>Study Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Points</em>' attribute.
	 * @see #getStudyPoints()
	 * @generated
	 */
	void setStudyPoints(float value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(String)
	 * @see Courses.CoursesPackage#getCourse_Level()
	 * @model
	 * @generated
	 */
	String getLevel();

	/**
	 * Sets the value of the '{@link Courses.Course#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(String value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' attribute.
	 * @see #setSemester(String)
	 * @see Courses.CoursesPackage#getCourse_Semester()
	 * @model
	 * @generated
	 */
	String getSemester();

	/**
	 * Sets the value of the '{@link Courses.Course#getSemester <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' attribute.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see Courses.CoursesPackage#getCourse_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link Courses.Course#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Exam Id</b></em>' containment reference list.
	 * The list contents are of type {@link Courses.Exams}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exam Id</em>' containment reference list.
	 * @see Courses.CoursesPackage#getCourse_ExamId()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Exams> getExamId();

	/**
	 * Returns the value of the '<em><b>Course Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Content</em>' attribute.
	 * @see #setCourseContent(String)
	 * @see Courses.CoursesPackage#getCourse_CourseContent()
	 * @model
	 * @generated
	 */
	String getCourseContent();

	/**
	 * Sets the value of the '{@link Courses.Course#getCourseContent <em>Course Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Content</em>' attribute.
	 * @see #getCourseContent()
	 * @generated
	 */
	void setCourseContent(String value);

	/**
	 * Returns the value of the '<em><b>Learning Outcome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learning Outcome</em>' attribute.
	 * @see #setLearningOutcome(String)
	 * @see Courses.CoursesPackage#getCourse_LearningOutcome()
	 * @model
	 * @generated
	 */
	String getLearningOutcome();

	/**
	 * Sets the value of the '{@link Courses.Course#getLearningOutcome <em>Learning Outcome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Learning Outcome</em>' attribute.
	 * @see #getLearningOutcome()
	 * @generated
	 */
	void setLearningOutcome(String value);

	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Id</em>' containment reference.
	 * @see #setLinkId(Links)
	 * @see Courses.CoursesPackage#getCourse_LinkId()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Links getLinkId();

	/**
	 * Sets the value of the '{@link Courses.Course#getLinkId <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Id</em>' containment reference.
	 * @see #getLinkId()
	 * @generated
	 */
	void setLinkId(Links value);

} // Course
