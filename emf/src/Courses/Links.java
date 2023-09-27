/**
 */
package Courses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Links</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Courses.Links#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link Courses.Links#getCoursePage <em>Course Page</em>}</li>
 *   <li>{@link Courses.Links#getCourseQuality <em>Course Quality</em>}</li>
 *   <li>{@link Courses.Links#getStudentEvaluation <em>Student Evaluation</em>}</li>
 * </ul>
 *
 * @see Courses.CoursesPackage#getLinks()
 * @model
 * @generated
 */
public interface Links extends EObject {
	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Id</em>' attribute.
	 * @see #setLinkId(String)
	 * @see Courses.CoursesPackage#getLinks_LinkId()
	 * @model id="true"
	 * @generated
	 */
	String getLinkId();

	/**
	 * Sets the value of the '{@link Courses.Links#getLinkId <em>Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Id</em>' attribute.
	 * @see #getLinkId()
	 * @generated
	 */
	void setLinkId(String value);

	/**
	 * Returns the value of the '<em><b>Course Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Page</em>' attribute.
	 * @see #setCoursePage(String)
	 * @see Courses.CoursesPackage#getLinks_CoursePage()
	 * @model
	 * @generated
	 */
	String getCoursePage();

	/**
	 * Sets the value of the '{@link Courses.Links#getCoursePage <em>Course Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Page</em>' attribute.
	 * @see #getCoursePage()
	 * @generated
	 */
	void setCoursePage(String value);

	/**
	 * Returns the value of the '<em><b>Course Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Quality</em>' attribute.
	 * @see #setCourseQuality(String)
	 * @see Courses.CoursesPackage#getLinks_CourseQuality()
	 * @model
	 * @generated
	 */
	String getCourseQuality();

	/**
	 * Sets the value of the '{@link Courses.Links#getCourseQuality <em>Course Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Quality</em>' attribute.
	 * @see #getCourseQuality()
	 * @generated
	 */
	void setCourseQuality(String value);

	/**
	 * Returns the value of the '<em><b>Student Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student Evaluation</em>' attribute.
	 * @see #setStudentEvaluation(String)
	 * @see Courses.CoursesPackage#getLinks_StudentEvaluation()
	 * @model
	 * @generated
	 */
	String getStudentEvaluation();

	/**
	 * Sets the value of the '{@link Courses.Links#getStudentEvaluation <em>Student Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student Evaluation</em>' attribute.
	 * @see #getStudentEvaluation()
	 * @generated
	 */
	void setStudentEvaluation(String value);

} // Links
