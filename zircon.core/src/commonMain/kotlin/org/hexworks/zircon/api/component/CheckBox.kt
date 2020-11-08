package org.hexworks.zircon.api.component

import org.hexworks.zircon.api.behavior.Selectable
import org.hexworks.zircon.api.behavior.TextHolder
import org.hexworks.zircon.internal.component.impl.DefaultCheckBox.CheckBoxState
import org.hexworks.zircon.internal.component.impl.DefaultCheckBox.CheckBoxAlignment

/**
 * A [CheckBox] is a [Selectable] that represents its [Selectable.isSelected]
 * state with a check box.
 */
interface CheckBox : Component, Selectable, TextHolder {

    val checkBoxState: CheckBoxState
    val labelAlignment: CheckBoxAlignment
}
