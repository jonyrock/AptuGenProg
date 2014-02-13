/**
 */
package org.xtext.example.mydsl.subGrLang.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.subGrLang.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubGrLangFactoryImpl extends EFactoryImpl implements SubGrLangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SubGrLangFactory init()
  {
    try
    {
      SubGrLangFactory theSubGrLangFactory = (SubGrLangFactory)EPackage.Registry.INSTANCE.getEFactory(SubGrLangPackage.eNS_URI);
      if (theSubGrLangFactory != null)
      {
        return theSubGrLangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SubGrLangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubGrLangFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SubGrLangPackage.MODEL: return createModel();
      case SubGrLangPackage.PERSON: return createPerson();
      case SubGrLangPackage.FOLLOW_RECORD: return createFollowRecord();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Person createPerson()
  {
    PersonImpl person = new PersonImpl();
    return person;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FollowRecord createFollowRecord()
  {
    FollowRecordImpl followRecord = new FollowRecordImpl();
    return followRecord;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubGrLangPackage getSubGrLangPackage()
  {
    return (SubGrLangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SubGrLangPackage getPackage()
  {
    return SubGrLangPackage.eINSTANCE;
  }

} //SubGrLangFactoryImpl
