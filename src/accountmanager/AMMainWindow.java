/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accountmanager;

/**
 *
 * @author georg
 */
public class AMMainWindow extends javax.swing.JFrame {

    /**
     * Creates new form AMMainWindow
     */
    public AMMainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        objectsList = new javax.swing.JList();
        objectFilterField = new javax.swing.JTextField();
        toolBar = new javax.swing.JToolBar();
        usersToogledButton = new javax.swing.JToggleButton();
        groupToogledButton = new javax.swing.JToggleButton();
        addToolButton = new javax.swing.JButton();
        deleteToolButton = new javax.swing.JButton();
        editToolButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 32), new java.awt.Dimension(3, 32), new java.awt.Dimension(0, 32));
        connectToolButton = new javax.swing.JButton();
        disconnectButton = new javax.swing.JButton();
        settingToolButton = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(3, 32), new java.awt.Dimension(3, 32), new java.awt.Dimension(0, 32));
        quitToolButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        objectBrowser = new javax.swing.JTable();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        usersItem = new javax.swing.JMenuItem();
        groupItem = new javax.swing.JMenuItem();
        conectionAction = new javax.swing.JMenuItem();
        disconnectItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        setingsItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        quitItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuEdit = new javax.swing.JMenu();
        addItem = new javax.swing.JMenuItem();
        editItem = new javax.swing.JMenuItem();
        deleteItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Менеджер учетных записей");
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        objectsList.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        objectsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        objectsList.setToolTipText("");
        objectsList.setMaximumSize(new java.awt.Dimension(150, 1000));
        jScrollPane1.setViewportView(objectsList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        objectFilterField.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        objectFilterField.setMinimumSize(new java.awt.Dimension(288, 31));
        objectFilterField.setPreferredSize(new java.awt.Dimension(280, 31));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.2;
        getContentPane().add(objectFilterField, gridBagConstraints);

        toolBar.setFloatable(false);
        toolBar.setRollover(true);

        usersToogledButton.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        usersToogledButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        usersToogledButton.setSelected(true);
        usersToogledButton.setToolTipText("Пользователи");
        usersToogledButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        toolBar.add(usersToogledButton);
        usersToogledButton.getAccessibleContext().setAccessibleDescription("usersToggle");

        groupToogledButton.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        groupToogledButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group.png"))); // NOI18N
        groupToogledButton.setToolTipText("Группы");
        toolBar.add(groupToogledButton);

        addToolButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        addToolButton.setToolTipText("Добавить");
        addToolButton.setFocusable(false);
        addToolButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addToolButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(addToolButton);

        deleteToolButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        deleteToolButton.setToolTipText("Удалить");
        deleteToolButton.setFocusable(false);
        deleteToolButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteToolButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(deleteToolButton);

        editToolButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        editToolButton.setToolTipText("Изменить");
        editToolButton.setFocusable(false);
        editToolButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editToolButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(editToolButton);

        filler1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        toolBar.add(filler1);

        connectToolButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/connect.png"))); // NOI18N
        connectToolButton.setToolTipText("Подключить");
        connectToolButton.setFocusable(false);
        connectToolButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        connectToolButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(connectToolButton);

        disconnectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/disconnect.png"))); // NOI18N
        disconnectButton.setToolTipText("Отключить");
        disconnectButton.setFocusable(false);
        disconnectButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        disconnectButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(disconnectButton);

        settingToolButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings.png"))); // NOI18N
        settingToolButton.setToolTipText("Настройки программы");
        settingToolButton.setFocusable(false);
        settingToolButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        settingToolButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(settingToolButton);

        filler2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        toolBar.add(filler2);

        quitToolButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        quitToolButton.setToolTipText("Выход");
        toolBar.add(quitToolButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(toolBar, gridBagConstraints);

        objectBrowser.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        objectBrowser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Параметр", "Значение"
            }
        ));
        jScrollPane3.setViewportView(objectBrowser);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.8;
        getContentPane().add(jScrollPane3, gridBagConstraints);

        menuFile.setText("Файл");
        menuFile.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        usersItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        usersItem.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        usersItem.setText("Пользователи");
        menuFile.add(usersItem);

        groupItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        groupItem.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        groupItem.setText("Группы");
        menuFile.add(groupItem);

        conectionAction.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        conectionAction.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        conectionAction.setText("Подключить");
        menuFile.add(conectionAction);

        disconnectItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        disconnectItem.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        disconnectItem.setText("Отключить");
        menuFile.add(disconnectItem);

        jSeparator1.setBorder(new javax.swing.border.MatteBorder(null));
        menuFile.add(jSeparator1);

        setingsItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        setingsItem.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        setingsItem.setText("Настройки");
        menuFile.add(setingsItem);

        jSeparator2.setBorder(new javax.swing.border.MatteBorder(null));
        menuFile.add(jSeparator2);

        quitItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        quitItem.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        quitItem.setText("Выход");
        menuFile.add(quitItem);
        menuFile.add(jSeparator3);

        menuBar.add(menuFile);

        menuEdit.setText("Редактирование");
        menuEdit.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        addItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        addItem.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        addItem.setText("Добавить");
        menuEdit.add(addItem);

        editItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        editItem.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        editItem.setText("Редактировать");
        menuEdit.add(editItem);

        deleteItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        deleteItem.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        deleteItem.setText("Удалить");
        menuEdit.add(deleteItem);

        menuBar.add(menuEdit);

        setJMenuBar(menuBar);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-629)/2, 800, 629);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem addItem;
    public javax.swing.JButton addToolButton;
    public javax.swing.JMenuItem conectionAction;
    public javax.swing.JButton connectToolButton;
    public javax.swing.JMenuItem deleteItem;
    public javax.swing.JButton deleteToolButton;
    public javax.swing.JButton disconnectButton;
    public javax.swing.JMenuItem disconnectItem;
    public javax.swing.JMenuItem editItem;
    public javax.swing.JButton editToolButton;
    public javax.swing.Box.Filler filler1;
    public javax.swing.Box.Filler filler2;
    public javax.swing.JMenuItem groupItem;
    public javax.swing.JToggleButton groupToogledButton;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JPopupMenu.Separator jSeparator1;
    public javax.swing.JPopupMenu.Separator jSeparator2;
    public javax.swing.JPopupMenu.Separator jSeparator3;
    public javax.swing.JMenuBar menuBar;
    public javax.swing.JMenu menuEdit;
    public javax.swing.JMenu menuFile;
    public javax.swing.JTable objectBrowser;
    public javax.swing.JTextField objectFilterField;
    public javax.swing.JList objectsList;
    public javax.swing.JMenuItem quitItem;
    public javax.swing.JButton quitToolButton;
    public javax.swing.JMenuItem setingsItem;
    public javax.swing.JButton settingToolButton;
    public javax.swing.JToolBar toolBar;
    public javax.swing.JMenuItem usersItem;
    public javax.swing.JToggleButton usersToogledButton;
    // End of variables declaration//GEN-END:variables
}
