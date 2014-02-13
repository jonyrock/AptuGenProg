/**
 */
package org.xtext.example.mydsl.subGrLang;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.subGrLang.SubGrLangPackage
 * @generated
 */
public interface SubGrLangFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SubGrLangFactory eINSTANCE = org.xtext.example.mydsl.subGrLang.impl.SubGrLangFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Person</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Person</em>'.
   * @generated
   */
  Person createPerson();

  /**
   * Returns a new object of class '<em>Follow Record</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Follow Record</em>'.
   * @generated
   */
  FollowRecord createFollowRecord();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SubGrLangPackage getSubGrLangPackage();

} //SubGrLangFactory
