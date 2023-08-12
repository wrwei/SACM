/**
 */
package terminology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link terminology.Category#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see terminology.Terminology_Package#getCategory()
 * @model
 * @generated
 */
public interface Category extends TerminologyAsset {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link terminology.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see terminology.Terminology_Package#getCategory_Category()
	 * @model
	 * @generated
	 */
	EList<Category> getCategory();

} // Category
