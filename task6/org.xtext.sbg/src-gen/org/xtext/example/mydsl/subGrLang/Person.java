/**
 */
package org.xtext.example.mydsl.subGrLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.subGrLang.Person#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.subGrLang.Person#getFollowing <em>Following</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.subGrLang.SubGrLangPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.subGrLang.SubGrLangPackage#getPerson_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.subGrLang.Person#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Following</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.subGrLang.FollowRecord}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Following</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Following</em>' containment reference list.
   * @see org.xtext.example.mydsl.subGrLang.SubGrLangPackage#getPerson_Following()
   * @model containment="true"
   * @generated
   */
  EList<FollowRecord> getFollowing();

} // Person
