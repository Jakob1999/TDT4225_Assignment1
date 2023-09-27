/**
 */
package Courses.impl;

import Courses.CoursesPackage;
import Courses.Grades;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grades</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Courses.impl.GradesImpl#getGradeId <em>Grade Id</em>}</li>
 *   <li>{@link Courses.impl.GradesImpl#getA <em>A</em>}</li>
 *   <li>{@link Courses.impl.GradesImpl#getB <em>B</em>}</li>
 *   <li>{@link Courses.impl.GradesImpl#getC <em>C</em>}</li>
 *   <li>{@link Courses.impl.GradesImpl#getD <em>D</em>}</li>
 *   <li>{@link Courses.impl.GradesImpl#getE <em>E</em>}</li>
 *   <li>{@link Courses.impl.GradesImpl#getF <em>F</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GradesImpl extends MinimalEObjectImpl.Container implements Grades {
	/**
	 * The default value of the '{@link #getGradeId() <em>Grade Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradeId()
	 * @generated
	 * @ordered
	 */
	protected static final String GRADE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGradeId() <em>Grade Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradeId()
	 * @generated
	 * @ordered
	 */
	protected String gradeId = GRADE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getA() <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected static final int A_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected int a = A_EDEFAULT;

	/**
	 * The default value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected static final int B_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected int b = B_EDEFAULT;

	/**
	 * The default value of the '{@link #getC() <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected static final int C_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getC() <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected int c = C_EDEFAULT;

	/**
	 * The default value of the '{@link #getD() <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected static final int D_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getD() <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected int d = D_EDEFAULT;

	/**
	 * The default value of the '{@link #getE() <em>E</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE()
	 * @generated
	 * @ordered
	 */
	protected static final int E_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getE() <em>E</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE()
	 * @generated
	 * @ordered
	 */
	protected int e = E_EDEFAULT;

	/**
	 * The default value of the '{@link #getF() <em>F</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF()
	 * @generated
	 * @ordered
	 */
	protected static final int F_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getF() <em>F</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF()
	 * @generated
	 * @ordered
	 */
	protected int f = F_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GradesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursesPackage.Literals.GRADES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGradeId() {
		return gradeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradeId(String newGradeId) {
		String oldGradeId = gradeId;
		gradeId = newGradeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursesPackage.GRADES__GRADE_ID, oldGradeId, gradeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getA() {
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA(int newA) {
		int oldA = a;
		a = newA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursesPackage.GRADES__A, oldA, a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getB() {
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(int newB) {
		int oldB = b;
		b = newB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursesPackage.GRADES__B, oldB, b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getC() {
		return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC(int newC) {
		int oldC = c;
		c = newC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursesPackage.GRADES__C, oldC, c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getD() {
		return d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD(int newD) {
		int oldD = d;
		d = newD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursesPackage.GRADES__D, oldD, d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getE() {
		return e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE(int newE) {
		int oldE = e;
		e = newE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursesPackage.GRADES__E, oldE, e));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getF() {
		return f;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF(int newF) {
		int oldF = f;
		f = newF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursesPackage.GRADES__F, oldF, f));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoursesPackage.GRADES__GRADE_ID:
				return getGradeId();
			case CoursesPackage.GRADES__A:
				return getA();
			case CoursesPackage.GRADES__B:
				return getB();
			case CoursesPackage.GRADES__C:
				return getC();
			case CoursesPackage.GRADES__D:
				return getD();
			case CoursesPackage.GRADES__E:
				return getE();
			case CoursesPackage.GRADES__F:
				return getF();
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
			case CoursesPackage.GRADES__GRADE_ID:
				setGradeId((String)newValue);
				return;
			case CoursesPackage.GRADES__A:
				setA((Integer)newValue);
				return;
			case CoursesPackage.GRADES__B:
				setB((Integer)newValue);
				return;
			case CoursesPackage.GRADES__C:
				setC((Integer)newValue);
				return;
			case CoursesPackage.GRADES__D:
				setD((Integer)newValue);
				return;
			case CoursesPackage.GRADES__E:
				setE((Integer)newValue);
				return;
			case CoursesPackage.GRADES__F:
				setF((Integer)newValue);
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
			case CoursesPackage.GRADES__GRADE_ID:
				setGradeId(GRADE_ID_EDEFAULT);
				return;
			case CoursesPackage.GRADES__A:
				setA(A_EDEFAULT);
				return;
			case CoursesPackage.GRADES__B:
				setB(B_EDEFAULT);
				return;
			case CoursesPackage.GRADES__C:
				setC(C_EDEFAULT);
				return;
			case CoursesPackage.GRADES__D:
				setD(D_EDEFAULT);
				return;
			case CoursesPackage.GRADES__E:
				setE(E_EDEFAULT);
				return;
			case CoursesPackage.GRADES__F:
				setF(F_EDEFAULT);
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
			case CoursesPackage.GRADES__GRADE_ID:
				return GRADE_ID_EDEFAULT == null ? gradeId != null : !GRADE_ID_EDEFAULT.equals(gradeId);
			case CoursesPackage.GRADES__A:
				return a != A_EDEFAULT;
			case CoursesPackage.GRADES__B:
				return b != B_EDEFAULT;
			case CoursesPackage.GRADES__C:
				return c != C_EDEFAULT;
			case CoursesPackage.GRADES__D:
				return d != D_EDEFAULT;
			case CoursesPackage.GRADES__E:
				return e != E_EDEFAULT;
			case CoursesPackage.GRADES__F:
				return f != F_EDEFAULT;
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
		result.append(" (GradeId: ");
		result.append(gradeId);
		result.append(", A: ");
		result.append(a);
		result.append(", B: ");
		result.append(b);
		result.append(", C: ");
		result.append(c);
		result.append(", D: ");
		result.append(d);
		result.append(", E: ");
		result.append(e);
		result.append(", F: ");
		result.append(f);
		result.append(')');
		return result.toString();
	}

} //GradesImpl
