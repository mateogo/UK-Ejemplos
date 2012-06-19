package kennedy.ar.ui.texteditor;


public class ObserverBuilder {
	private LittleTextEditor ted;
	private javax.swing.JTextArea textArea;
	private TextPrinter tPrinter;
	private AcceptButton acceptButton;
	
	public ObserverBuilder() {
		super();
		init();
	}

	private void init() {
		
		setTextArea(getTed().getTextArea());		
		
		
		// PRUEBA DE QUE NO SE NECESITA CAST
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Grabar g=new Grabar();
		getAcceptButton().addObserver(g);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		/* 		
		 * El metodo addObserver espera un tipo EventObserver.
		 * 
		 * El tipo Grabar EXTIENDE al tipo EventObserver, por lo tanto no necesita ser casteado,
		 *  ya que al ser su subtipo, Grabar contiene obligatoriamente todos los metodos que especifica 
		 * el supertipo EventObserver.
		 * 
		 * Hacer:
		 * 
		 * Grabar g=new Grabar();
		 * getAcceptButton().addObserver( (EventObserver) g   );
		 * 
		 * 
		 * Seria redundante ya que el tipo Grabar IMPLEMENTA UN EventObserver,
		 * y no necesitamos explicitarlo. (aunque hacerlo no es incorrecto, solo redundante)
		 *		   
		 * Mas info: http://java.sun.com/docs/books/jls/second_edition/html/conversions.doc.html
		 * 
		 *  
		 * Cabe destacar que si g fuera un supertipo de EventObserver, por ejemplo Object, 
		 * si necesitariamos hacer casting.  Por ej:
		 * 
		 * Object g=new Grabar();
		 * getAcceptButton().addObserver( (EventObserver) g  );
		 * 
		 * En este caso es obligatorio el cast ya que Object es mas generico que  EventObserver 
		 * y no posee sus metodos.
		 *  
		 * */
				
		
		getTPrinter().addMeAsObserver(getAcceptButton());
		getTPrinter().setJTextArea(getTextArea());
							
		
		getTed().setVisible(true);		
		
		System.out.println("ChauObserver");		
	}
	
	public LittleTextEditor getTed() {
		if (ted == null)
			ted = new LittleTextEditor();
		return ted;		
	}

	
	public void setTed(LittleTextEditor ted) {
		this.ted = ted;
	}

	
	public javax.swing.JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(javax.swing.JTextArea textArea) {
		this.textArea = textArea;
	}

	
	public TextPrinter getTPrinter() {
		if (tPrinter == null)
			tPrinter = new TextPrinter();
		return tPrinter;
	}

	
	public void setTPrinter(TextPrinter tPrinter) {
		this.tPrinter = tPrinter;
	}
	
	
	public AcceptButton getAcceptButton() {
		if (acceptButton == null)
			acceptButton = new AcceptButton(getTed());
		return acceptButton;
	}	
	
	
	public void setAcceptButton(AcceptButton acceptButton) {
		this.acceptButton = acceptButton;
	}

	
	public static void main(String args[]) {
		new ObserverBuilder();
	}
}