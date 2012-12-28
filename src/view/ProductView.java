/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import dao.ProductDao;

/**
 *
 * @author larry
 */
public class ProductView extends JFrame {
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private ProductDao pr_model;
	
    private JButton addNewButton;
    private JButton searchButton;
    private JLabel mTableLabel;
    private JScrollPane movieListFrame;
    private JTable moviesTable;
    private JTextField searchField;
    private JLabel searchLabel;
    private JScrollPane tableScrollPane;
    private JComboBox viewByBox;
    private JLabel viewByLabel;
    private JComboBox viewByOptionBox;
    
    private String[] columns = {"Title", "Genre", "Rating", "Release Year", "Type"};
    
    private Object[] row = new Object[5];
    
    private DefaultTableModel model = new DefaultTableModel(columns, 0);
    // End of variables declaration//GEN-END:variables
    /**
     * Creates new form ProductView2
     */
    public ProductView(ProductDao model) {
        initComponents();
        //this.setExtendedState(ProductView.MAXIMIZED_BOTH);
    }
    
    // get() methods to give access to other classes
    public JTextField getSearchField(){
    	return searchField;
    }
    
    public JComboBox getViewByOptionBox(){
    	return viewByOptionBox;
    }
    // End of get() methods

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mTableLabel = new JLabel();
        viewByLabel = new JLabel();
        tableScrollPane = new JScrollPane();
        moviesTable = new JTable();
        viewByBox = new JComboBox();
        viewByOptionBox = new JComboBox();
        addNewButton = new JButton();
        searchLabel = new JLabel();
        searchField = new JTextField();
        searchButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Video Club");

        mTableLabel.setFont(new Font("Ubuntu", 3, 18)); // NOI18N
        mTableLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mTableLabel.setText("Movies List");

        viewByLabel.setText("View Movies By:");
        
        moviesTable.setModel(model);
        moviesTable.setColumnSelectionAllowed(true);
        moviesTable.getTableHeader().setReorderingAllowed(false);
        tableScrollPane.setViewportView(moviesTable);
        moviesTable.getColumnModel().getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        moviesTable.getColumnModel().getColumn(0).setResizable(false);
        moviesTable.getColumnModel().getColumn(1).setResizable(false);
        moviesTable.getColumnModel().getColumn(2).setResizable(false);
        moviesTable.getColumnModel().getColumn(3).setResizable(false);
        moviesTable.getColumnModel().getColumn(4).setResizable(false);

        viewByBox.setModel(new DefaultComboBoxModel(new String[] { "Genre", "Rating", "Year", "Type" }));

        viewByOptionBox.setModel(new DefaultComboBoxModel(new String[] { "example1", "example2" }));

        addNewButton.setFont(new Font("Ubuntu", 3, 15)); // NOI18N
        addNewButton.setText("Add New Movie");

        searchLabel.setText("Search By Title:");

        searchButton.setText("Submit");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(mTableLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tableScrollPane, GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addNewButton)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewByLabel)
                                .addGap(106, 106, 106)
                                .addComponent(searchLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewByBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewByOptionBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchButton)
                                .addGap(0, 66, Short.MAX_VALUE))
                            .addComponent(searchField))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mTableLabel, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableScrollPane, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(viewByLabel)
                    .addComponent(addNewButton)
                    .addComponent(searchLabel)
                    .addComponent(searchField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(viewByBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewByOptionBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void viewByBoxItemStateChanged(ItemListener viewBy) {
        viewByBox.addItemListener(viewBy);
    }
    
    public void viewByOptionBoxItemStateChanged(ItemListener viewByOption) {
        viewByOptionBox.addItemListener(viewByOption);
    }
    
    public void submitSearchListener(ActionListener search) {
        searchButton.addActionListener(search);
    }
    
    public void addNewMovieListener(ActionListener addMovie) {
        addNewButton.addActionListener(addMovie);
    }
        
    public void showAll(ArrayList<Object> allProducts) {
    	int i = model.getRowCount()*5;
    	//model = new DefaultTableModel(columns, 0);
    	while (i < allProducts.size()) {
    		row[0] = allProducts.get(i);
    		row[1] = allProducts.get(i+1);
    		row[2] = allProducts.get(i+2);
    		row[3] = allProducts.get(i+3);
    		row[4] = allProducts.get(i+4);
    		model.addRow(row);
    		i += 5;
    	}
    	moviesTable = new JTable(model);
    }


	public void showOne(ArrayList<Object> oneProduct) {
		row[0] = oneProduct.get(0);
        row[1] = oneProduct.get(1);
        row[2] = oneProduct.get(2);
        row[3] = oneProduct.get(3);
        row[4] = oneProduct.get(4);
        model.addRow(row);
        moviesTable = new JTable(model);
	}
}