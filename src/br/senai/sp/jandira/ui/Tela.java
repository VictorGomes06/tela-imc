
package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.colorchooser.DefaultColorSelectionModel;
import javax.swing.text.StyleConstants.ColorConstants;

import br.senai.sp.jandira.model.Imc;

public class Tela {
	
public static void criarTela() {
		
		JFrame telaImc = new JFrame();
		telaImc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaImc.setSize(500, 550);		
		telaImc.setTitle("Calculadora IMC");
		telaImc.setLayout(null);
		
		JLabel lblTitulo = new JLabel();
		lblTitulo.setText("Cálculo de IMC");
		lblTitulo.setFont(new Font("Serif", Font.PLAIN, 30));
		lblTitulo.setForeground(Color.blue);
		lblTitulo.setBounds(130, 10, 300, 30);
		
		JLabel lblPeso = new JLabel();
		lblPeso.setText("Seu peso: ");
		lblPeso.setFont(new Font("Serif", Font.BOLD, 15));
		lblPeso.setBounds(30, 70, 300, 30);
		
		JTextField txtPeso = new JTextField();
		txtPeso.setBounds(120, 60, 110, 50);
		
		JLabel lblAltura = new JLabel();
		lblAltura.setText("altura");
		lblAltura.setFont(new Font("Serif", Font.BOLD, 15));
		lblAltura.setBounds(30, 150, 100, 30);
		
		JTextField txtAltura = new JTextField();
		txtAltura.setBounds(120, 140, 110, 50);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setFont(new Font("Serif", Font.BOLD, 20));
		btnCalcular.setBounds(110, 220, 250, 50);
		btnCalcular.setBackground(Color.GREEN);
		
		JLabel lblResultado = new JLabel("Resultados: ");
		lblResultado.setFont(new Font("Serif", Font.BOLD, 25));
		lblResultado.setBounds(30, 300, 150, 30);
		
		JLabel lblValorImc = new JLabel("Valor IMC: ");
		lblValorImc.setBounds(30, 350, 110, 30);
		
		JTextField txtValorImc = new JTextField();
		txtValorImc.setForeground(Color.green);
		txtValorImc.setBounds(150, 350, 100, 30);
		
		JLabel lblStatus = new JLabel ("Status :");
		lblStatus.setBounds(30,400,110,30); 
		
		
		JTextField txtEstadoImc = new JTextField();
		txtEstadoImc.setBounds(150, 400, 100, 30);
		
		telaImc.getContentPane().add(lblTitulo);
		telaImc.getContentPane().add(lblPeso);
		telaImc.getContentPane().add(txtPeso);
		telaImc.getContentPane().add(lblAltura);
		telaImc.getContentPane().add(txtAltura);
		telaImc.getContentPane().add(btnCalcular);
		telaImc.getContentPane().add(lblResultado);
		telaImc.getContentPane().add(lblValorImc);
		telaImc.getContentPane().add(txtValorImc);
		telaImc.getContentPane().add(txtEstadoImc);
		telaImc.getContentPane().add(lblStatus);
		
		
		telaImc.setVisible(true);
		
		//evento de click no botão
		
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Imc imc = new Imc();
				imc.setPeso(txtPeso.getText());
				
				lblValorImc.setText(imc.mostrarImcComoString());
				
			}
		} );
	}

	
	}
		
