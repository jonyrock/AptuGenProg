/**
 */
package org.xtext.example.mydsl.subGrLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Follow Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.subGrLang.FollowRecord#getPerson <em>Person</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.subGrLang.SubGrLangPackage#getFollowRecord()
 * @model
 * @generated
 */
public interface FollowRecord extends EObject
{
  /**
   * Returns the value of the '<em><b>Person</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Person</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Person</em>' reference.
   * @see #setPerson(Person)
   * @see org.xtext.example.mydsl.subGrLang.SubGrLangPackage#getFollowRecord_Person()
   * @model
   * @generated
   */
  Person getPerson();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.subGrLang.FollowRecord#getPerson <em>Person</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Person</em>' reference.
   * @see #getPerson()
   * @generated
   */
  void setPerson(Person value);

} // FollowRecord
