package com.jhw.gestion.modules.contabilidad.ui.tipo_cuenta;

import com.jhw.gestion.modules.contabilidad.ui.module.ContabilidadSwingModule;
import com.jhw.swing.models.input.icbs.InputComboBoxSelection;
import com.jhw.gestion.modules.contabilidad.core.domain.TipoCuentaDomain;
import com.jhw.gestion.modules.contabilidad.ui.module.ContabilidadModuleNavigator;
import com.jhw.swing.models.input.panels.ModelPanel;
import java.util.List;

/**
 *
 * @author Jesús Hernández Barrios (jhernandezb96@gmail.com)
 */
public class TipoCuentaICBS extends InputComboBoxSelection<TipoCuentaDomain> {

    public TipoCuentaICBS() {
        setLabel("Tipo de cuenta");
        setIcon(ContabilidadModuleNavigator.ICON_TIPO_CUENTA);
    }

    @Override
    public List<TipoCuentaDomain> getList() throws Exception{
        return ContabilidadSwingModule.tipoCuentaUC.findAll();
    }

    public void updateComboBoxCuadre(TipoCuentaDomain selectedItem) throws Exception {
        setUpList(ContabilidadSwingModule.tipoCuentaUC.findAllCuadre(selectedItem));
    }

    @Override
    public ModelPanel<TipoCuentaDomain> inputPanel() {
        return TipoCuentaInputView.from();
    }

}
