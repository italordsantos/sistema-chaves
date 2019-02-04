/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.awt.Toolkit;
import javax.swing.JInternalFrame;
import visao.JFramePrincipal;
import visao.chave.JInternalFrameChave;
import visao.grupo.JInternalFrameGrupo;
import visao.pegarChave.JInternalFramePegarChave;
import visao.pessoa.JInternalFramePessoa;
import visao.visualizar.JInternalFrameVisualizar;

/**
 *
 * @author italo
 */
public class ControleTela extends JFramePrincipal {

    // Área para declaração de variávels
    private JInternalFrameChave      jInternalFrameChave;
    private JInternalFrameGrupo      jInternalFrameGrupo;
    private JInternalFramePessoa     jInternalFramePessoa;
    private JInternalFrameVisualizar jInternalFrameVisualizar;
    private JInternalFramePegarChave jInternalFramePegarChave;
    //private JInternalFrame         jInternalFrameUsing;
    private JInternalFrame           jInternalFrameRemove;
    
    // Área para declaração de métodos únicos das variávels globais

    public JInternalFrameChave getjInternalFrameChave() {
        if(jInternalFrameChave == null){
            jInternalFrameChave = new JInternalFrameChave(getControleSistema());
        }
        return jInternalFrameChave;
    }

    public JInternalFrameGrupo getjInternalFrameGrupo() {
        if(jInternalFrameGrupo == null){
            jInternalFrameGrupo = new JInternalFrameGrupo(getControleSistema());
        }
        return jInternalFrameGrupo;
    }

    public JInternalFramePessoa getjInternalFramePessoa() {
        if(jInternalFramePessoa == null){
            jInternalFramePessoa = new JInternalFramePessoa(getControleSistema());
        }
        return jInternalFramePessoa;
    }

    public JInternalFrameVisualizar getjInternalFrameVisualizar() {
        if(jInternalFrameVisualizar == null){
            jInternalFrameVisualizar = new JInternalFrameVisualizar(getControleSistema());
        }
        return jInternalFrameVisualizar;
    }

    public JInternalFramePegarChave getjInternalFramePegarChave() {
        if(jInternalFramePegarChave == null){
            jInternalFramePegarChave = new JInternalFramePegarChave(getControleSistema());
        }
        return jInternalFramePegarChave;
    }

    public JInternalFrame getjInternalFrameRemove() {
        return jInternalFrameRemove;
    }

    public void setjInternalFrameRemove(JInternalFrame jInternalFrameRemove) {
        this.jInternalFrameRemove = jInternalFrameRemove;
    }

    // Área para declaração de construtores
    
    public ControleTela(ControleSistema controleSistema) {
        super(controleSistema);
        //setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height - 40);
        setVisible(true);
    }

    //´Área para declaração de demais métodos
    
    public void addJInternalFrame(JInternalFrame jInternalFrame){
        if(getjInternalFrameRemove() != null){
            getjInternalFrameRemove().setVisible(false);
        }        
        if(getJDesktopPane().isAncestorOf(jInternalFrame)) {
            getJDesktopPane().moveToFront(jInternalFrame);
            setjInternalFrameRemove(jInternalFrame);
        } else {
            getJDesktopPane().add(jInternalFrame);
            setjInternalFrameRemove(jInternalFrame);
        }
        repaint();
        jInternalFrame.setVisible(true);
    }

}
