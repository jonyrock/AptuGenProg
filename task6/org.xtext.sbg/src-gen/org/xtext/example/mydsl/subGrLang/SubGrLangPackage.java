/**
 */
package org.xtext.example.mydsl.subGrLang;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.subGrLang.SubGrLangFactory
 * @model kind="package"
 * @generated
 */
public interface SubGrLangPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "subGrLang";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/SubGrLang";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "subGrLang";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SubGrLangPackage eINSTANCE = org.xtext.example.mydsl.subGrLang.impl.SubGrLangPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.subGrLang.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.subGrLang.impl.ModelImpl
   * @see org.xtext.example.mydsl.subGrLang.impl.SubGrLangPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Persons</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PERSONS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.subGrLang.impl.PersonImpl <em>Person</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.subGrLang.impl.PersonImpl
   * @see org.xtext.example.mydsl.subGrLang.impl.SubGrLangPackageImpl#getPerson()
   * @generated
   */
  int PERSON = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__NAME = 0;

  /**
   * The feature id for the '<em><b>Following</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__FOLLOWING = 1;

  /**
   * The number of structural features of the '<em>Person</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.subGrLang.impl.FollowRecordImpl <em>Follow Record</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.subGrLang.impl.FollowRecordImpl
   * @see org.xtext.example.mydsl.subGrLang.impl.SubGrLangPackageImpl#getFollowRecord()
   * @generated
   */
  int FOLLOW_RECORD = 2;

  /**
   * The feature id for the '<em><b>Person</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOLLOW_RECORD__PERSON = 0;

  /**
   * The number of structural features of the '<em>Follow Record</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOLLOW_RECORD_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.subGrLang.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.mydsl.subGrLang.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.subGrLang.Model#getPersons <em>Persons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Persons</em>'.
   * @see org.xtext.example.mydsl.subGrLang.Model#getPersons()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Persons();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.subGrLang.Person <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Person</em>'.
   * @see org.xtext.example.mydsl.subGrLang.Person
   * @generated
   */
  EClass getPerson();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.subGrLang.Person#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.subGrLang.Person#getName()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.subGrLang.Person#getFollowing <em>Following</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Following</em>'.
   * @see org.xtext.example.mydsl.subGrLang.Person#getFollowing()
   * @see #getPerson()
   * @generated
   */
  EReference getPerson_Following();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.subGrLang.FollowRecord <em>Follow Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Follow Record</em>'.
   * @see org.xtext.example.mydsl.subGrLang.FollowRecord
   * @generated
   */
  EClass getFollowRecord();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.subGrLang.FollowRecord#getPerson <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Person</em>'.
   * @see org.xtext.example.mydsl.subGrLang.FollowRecord#getPerson()
   * @see #getFollowRecord()
   * @generated
   */
  EReference getFollowRecord_Person();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SubGrLangFactory getSubGrLangFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.subGrLang.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.subGrLang.impl.ModelImpl
     * @see org.xtext.example.mydsl.subGrLang.impl.SubGrLangPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PERSONS = eINSTANCE.getModel_Persons();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.subGrLang.impl.PersonImpl <em>Person</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.subGrLang.impl.PersonImpl
     * @see org.xtext.example.mydsl.subGrLang.impl.SubGrLangPackageImpl#getPerson()
     * @generated
     */
    EClass PERSON = eINSTANCE.getPerson();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

    /**
     * The meta object literal for the '<em><b>Following</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSON__FOLLOWING = eINSTANCE.getPerson_Following();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.subGrLang.impl.FollowRecordImpl <em>Follow Record</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.subGrLang.impl.FollowRecordImpl
     * @see org.xtext.example.mydsl.subGrLang.impl.SubGrLangPackageImpl#getFollowRecord()
     * @generated
     */
    EClass FOLLOW_RECORD = eINSTANCE.getFollowRecord();

    /**
     * The meta object literal for the '<em><b>Person</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOLLOW_RECORD__PERSON = eINSTANCE.getFollowRecord_Person();

  }

} //SubGrLangPackage
