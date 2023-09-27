/**
 */
package Courses.impl;

import Courses.CoursesPackage;
import Courses.Links;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Links</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Courses.impl.LinksImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link Courses.impl.LinksImpl#getCoursePage <em>Course Page</em>}</li>
 *   <li>{@link Courses.impl.LinksImpl#getCourseQuality <em>Course Quality</em>}</li>
 *   <li>{@link Courses.impl.LinksImpl#getStudentEvaluation <em>Student Evaluation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinksImpl extends MinimalEObjectImpl.Container implements Links {
	/**
	 * The default value of the '{@link #getLinkId() <em>Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkId()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkId() <em>Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkId()
	 * @generated
	 * @ordered
	 */
	protected String linkId = LINK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoursePage() <em>Course Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoursePage()
	 * @generated
	 * @ordered
	 */
	protected static final String COURSE_PAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoursePage() <em>Course Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoursePage()
	 * @generated
	 * @ordered
	 */
	protected String coursePage = COURSE_PAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCourseQuality() <em>Course Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseQuality()
	 * @generated
	 * @ordered
	 */
	protected static final String COURSE_QUALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCourseQuality() <em>Course Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseQuality()
	 * @generated
	 * @ordered
	 */
	protected String courseQuality = COURSE_QUALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStudentEvaluation() <em>Student Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentEvaluation()
	 * @generated
	 * @ordered
	 */
	protected static final String STUDENT_EVALUATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStudentEvaluation() <em>Student Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentEvaluation()
	 * @generated
	 * @ordered
	 */
	protected String studentEvaluation = STUDENT_EVALUATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinksImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursesPackage.Literals.LINKS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinkId() {
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkId(String newLinkId) {
		String oldLinkId = linkId;
		linkId = newLinkId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursesPackage.LINKS__LINK_ID, oldLinkId, linkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoursePage() {
		return coursePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoursePage(String newCoursePage) {
		String oldCoursePage = coursePage;
		coursePage = newCoursePage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursesPackage.LINKS__COURSE_PAGE, oldCoursePage, coursePage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCourseQuality() {
		return courseQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseQuality(String newCourseQuality) {
		String oldCourseQuality = courseQuality;
		courseQuality = newCourseQuality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursesPackage.LINKS__COURSE_QUALITY, oldCourseQuality, courseQuality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStudentEvaluation() {
		return studentEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudentEvaluation(String newStudentEvaluation) {
		String oldStudentEvaluation = studentEvaluation;
		studentEvaluation = newStudentEvaluation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursesPackage.LINKS__STUDENT_EVALUATION, oldStudentEvaluation, studentEvaluation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoursesPackage.LINKS__LINK_ID:
				return getLinkId();
			case CoursesPackage.LINKS__COURSE_PAGE:
				return getCoursePage();
			case CoursesPackage.LINKS__COURSE_QUALITY:
				return getCourseQuality();
			case CoursesPackage.LINKS__STUDENT_EVALUATION:
				return getStudentEvaluation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoursesPackage.LINKS__LINK_ID:
				setLinkId((String)newValue);
				return;
			case CoursesPackage.LINKS__COURSE_PAGE:
				setCoursePage((String)newValue);
				return;
			case CoursesPackage.LINKS__COURSE_QUALITY:
				setCourseQuality((String)newValue);
				return;
			case CoursesPackage.LINKS__STUDENT_EVALUATION:
				setStudentEvaluation((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CoursesPackage.LINKS__LINK_ID:
				setLinkId(LINK_ID_EDEFAULT);
				return;
			case CoursesPackage.LINKS__COURSE_PAGE:
				setCoursePage(COURSE_PAGE_EDEFAULT);
				return;
			case CoursesPackage.LINKS__COURSE_QUALITY:
				setCourseQuality(COURSE_QUALITY_EDEFAULT);
				return;
			case CoursesPackage.LINKS__STUDENT_EVALUATION:
				setStudentEvaluation(STUDENT_EVALUATION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CoursesPackage.LINKS__LINK_ID:
				return LINK_ID_EDEFAULT == null ? linkId != null : !LINK_ID_EDEFAULT.equals(linkId);
			case CoursesPackage.LINKS__COURSE_PAGE:
				return COURSE_PAGE_EDEFAULT == null ? coursePage != null : !COURSE_PAGE_EDEFAULT.equals(coursePage);
			case CoursesPackage.LINKS__COURSE_QUALITY:
				return COURSE_QUALITY_EDEFAULT == null ? courseQuality != null : !COURSE_QUALITY_EDEFAULT.equals(courseQuality);
			case CoursesPackage.LINKS__STUDENT_EVALUATION:
				return STUDENT_EVALUATION_EDEFAULT == null ? studentEvaluation != null : !STUDENT_EVALUATION_EDEFAULT.equals(studentEvaluation);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (LinkId: ");
		result.append(linkId);
		result.append(", CoursePage: ");
		result.append(coursePage);
		result.append(", CourseQuality: ");
		result.append(courseQuality);
		result.append(", StudentEvaluation: ");
		result.append(studentEvaluation);
		result.append(')');
		return result.toString();
	}

} //LinksImpl
