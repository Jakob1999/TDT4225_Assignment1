/**
 */
package Courses.impl;

import Courses.CoursesPackage;
import Courses.Exams;
import Courses.Grades;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exams</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Courses.impl.ExamsImpl#getExamId <em>Exam Id</em>}</li>
 *   <li>{@link Courses.impl.ExamsImpl#getYear <em>Year</em>}</li>
 *   <li>{@link Courses.impl.ExamsImpl#isCont <em>Cont</em>}</li>
 *   <li>{@link Courses.impl.ExamsImpl#getGradeId <em>Grade Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExamsImpl extends MinimalEObjectImpl.Container implements Exams {
	/**
	 * The default value of the '{@link #getExamId() <em>Exam Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamId()
	 * @generated
	 * @ordered
	 */
	protected static final String EXAM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExamId() <em>Exam Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamId()
	 * @generated
	 * @ordered
	 */
	protected String examId = EXAM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #isCont() <em>Cont</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCont()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCont() <em>Cont</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCont()
	 * @generated
	 * @ordered
	 */
	protected boolean cont = CONT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGradeId() <em>Grade Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradeId()
	 * @generated
	 * @ordered
	 */
	protected Grades gradeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExamsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursesPackage.Literals.EXAMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExamId() {
		return examId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExamId(String newExamId) {
		String oldExamId = examId;
		examId = newExamId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursesPackage.EXAMS__EXAM_ID, oldExamId, examId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursesPackage.EXAMS__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCont() {
		return cont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCont(boolean newCont) {
		boolean oldCont = cont;
		cont = newCont;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursesPackage.EXAMS__CONT, oldCont, cont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grades getGradeId() {
		return gradeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGradeId(Grades newGradeId, NotificationChain msgs) {
		Grades oldGradeId = gradeId;
		gradeId = newGradeId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoursesPackage.EXAMS__GRADE_ID, oldGradeId, newGradeId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradeId(Grades newGradeId) {
		if (newGradeId != gradeId) {
			NotificationChain msgs = null;
			if (gradeId != null)
				msgs = ((InternalEObject)gradeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoursesPackage.EXAMS__GRADE_ID, null, msgs);
			if (newGradeId != null)
				msgs = ((InternalEObject)newGradeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoursesPackage.EXAMS__GRADE_ID, null, msgs);
			msgs = basicSetGradeId(newGradeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursesPackage.EXAMS__GRADE_ID, newGradeId, newGradeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoursesPackage.EXAMS__GRADE_ID:
				return basicSetGradeId(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoursesPackage.EXAMS__EXAM_ID:
				return getExamId();
			case CoursesPackage.EXAMS__YEAR:
				return getYear();
			case CoursesPackage.EXAMS__CONT:
				return isCont();
			case CoursesPackage.EXAMS__GRADE_ID:
				return getGradeId();
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
			case CoursesPackage.EXAMS__EXAM_ID:
				setExamId((String)newValue);
				return;
			case CoursesPackage.EXAMS__YEAR:
				setYear((Integer)newValue);
				return;
			case CoursesPackage.EXAMS__CONT:
				setCont((Boolean)newValue);
				return;
			case CoursesPackage.EXAMS__GRADE_ID:
				setGradeId((Grades)newValue);
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
			case CoursesPackage.EXAMS__EXAM_ID:
				setExamId(EXAM_ID_EDEFAULT);
				return;
			case CoursesPackage.EXAMS__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case CoursesPackage.EXAMS__CONT:
				setCont(CONT_EDEFAULT);
				return;
			case CoursesPackage.EXAMS__GRADE_ID:
				setGradeId((Grades)null);
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
			case CoursesPackage.EXAMS__EXAM_ID:
				return EXAM_ID_EDEFAULT == null ? examId != null : !EXAM_ID_EDEFAULT.equals(examId);
			case CoursesPackage.EXAMS__YEAR:
				return year != YEAR_EDEFAULT;
			case CoursesPackage.EXAMS__CONT:
				return cont != CONT_EDEFAULT;
			case CoursesPackage.EXAMS__GRADE_ID:
				return gradeId != null;
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
		result.append(" (ExamId: ");
		result.append(examId);
		result.append(", Year: ");
		result.append(year);
		result.append(", Cont: ");
		result.append(cont);
		result.append(')');
		return result.toString();
	}

} //ExamsImpl
