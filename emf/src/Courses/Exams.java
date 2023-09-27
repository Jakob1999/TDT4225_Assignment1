/**
 */
package Courses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exams</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Courses.Exams#getExamId <em>Exam Id</em>}</li>
 *   <li>{@link Courses.Exams#getYear <em>Year</em>}</li>
 *   <li>{@link Courses.Exams#isCont <em>Cont</em>}</li>
 *   <li>{@link Courses.Exams#getGradeId <em>Grade Id</em>}</li>
 * </ul>
 *
 * @see Courses.CoursesPackage#getExams()
 * @model
 * @generated
 */
public interface Exams extends EObject {
	/**
	 * Returns the value of the '<em><b>Exam Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exam Id</em>' attribute.
	 * @see #setExamId(String)
	 * @see Courses.CoursesPackage#getExams_ExamId()
	 * @model id="true"
	 * @generated
	 */
	String getExamId();

	/**
	 * Sets the value of the '{@link Courses.Exams#getExamId <em>Exam Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exam Id</em>' attribute.
	 * @see #getExamId()
	 * @generated
	 */
	void setExamId(String value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see Courses.CoursesPackage#getExams_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link Courses.Exams#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Cont</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cont</em>' attribute.
	 * @see #setCont(boolean)
	 * @see Courses.CoursesPackage#getExams_Cont()
	 * @model
	 * @generated
	 */
	boolean isCont();

	/**
	 * Sets the value of the '{@link Courses.Exams#isCont <em>Cont</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cont</em>' attribute.
	 * @see #isCont()
	 * @generated
	 */
	void setCont(boolean value);

	/**
	 * Returns the value of the '<em><b>Grade Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade Id</em>' containment reference.
	 * @see #setGradeId(Grades)
	 * @see Courses.CoursesPackage#getExams_GradeId()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Grades getGradeId();

	/**
	 * Sets the value of the '{@link Courses.Exams#getGradeId <em>Grade Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade Id</em>' containment reference.
	 * @see #getGradeId()
	 * @generated
	 */
	void setGradeId(Grades value);

} // Exams
