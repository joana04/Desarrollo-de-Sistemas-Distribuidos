
package Cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Cliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ParImpar_QNAME = new QName("http://ws.mx.ipn.com/", "parImpar");
    private final static QName _Hello_QNAME = new QName("http://ws.mx.ipn.com/", "hello");
    private final static QName _Dividir_QNAME = new QName("http://ws.mx.ipn.com/", "dividir");
    private final static QName _DividirResponse_QNAME = new QName("http://ws.mx.ipn.com/", "dividirResponse");
    private final static QName _ParImparResponse_QNAME = new QName("http://ws.mx.ipn.com/", "parImparResponse");
    private final static QName _Sumar_QNAME = new QName("http://ws.mx.ipn.com/", "sumar");
    private final static QName _HelloResponse_QNAME = new QName("http://ws.mx.ipn.com/", "helloResponse");
    private final static QName _SumarResponse_QNAME = new QName("http://ws.mx.ipn.com/", "sumarResponse");
    private final static QName _MultiplicarResponse_QNAME = new QName("http://ws.mx.ipn.com/", "multiplicarResponse");
    private final static QName _DesEstandar_QNAME = new QName("http://ws.mx.ipn.com/", "desEstandar");
    private final static QName _FactorialResponse_QNAME = new QName("http://ws.mx.ipn.com/", "factorialResponse");
    private final static QName _DesEstandarResponse_QNAME = new QName("http://ws.mx.ipn.com/", "desEstandarResponse");
    private final static QName _MinimoResponse_QNAME = new QName("http://ws.mx.ipn.com/", "minimoResponse");
    private final static QName _Multiplicar_QNAME = new QName("http://ws.mx.ipn.com/", "multiplicar");
    private final static QName _Restar_QNAME = new QName("http://ws.mx.ipn.com/", "restar");
    private final static QName _Factorial_QNAME = new QName("http://ws.mx.ipn.com/", "factorial");
    private final static QName _Promedio_QNAME = new QName("http://ws.mx.ipn.com/", "promedio");
    private final static QName _FibonacciResponse_QNAME = new QName("http://ws.mx.ipn.com/", "fibonacciResponse");
    private final static QName _PromedioResponse_QNAME = new QName("http://ws.mx.ipn.com/", "promedioResponse");
    private final static QName _RestarResponse_QNAME = new QName("http://ws.mx.ipn.com/", "restarResponse");
    private final static QName _Minimo_QNAME = new QName("http://ws.mx.ipn.com/", "minimo");
    private final static QName _Fibonacci_QNAME = new QName("http://ws.mx.ipn.com/", "fibonacci");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Fibonacci }
     * 
     */
    public Fibonacci createFibonacci() {
        return new Fibonacci();
    }

    /**
     * Create an instance of {@link Minimo }
     * 
     */
    public Minimo createMinimo() {
        return new Minimo();
    }

    /**
     * Create an instance of {@link RestarResponse }
     * 
     */
    public RestarResponse createRestarResponse() {
        return new RestarResponse();
    }

    /**
     * Create an instance of {@link FibonacciResponse }
     * 
     */
    public FibonacciResponse createFibonacciResponse() {
        return new FibonacciResponse();
    }

    /**
     * Create an instance of {@link PromedioResponse }
     * 
     */
    public PromedioResponse createPromedioResponse() {
        return new PromedioResponse();
    }

    /**
     * Create an instance of {@link Promedio }
     * 
     */
    public Promedio createPromedio() {
        return new Promedio();
    }

    /**
     * Create an instance of {@link Factorial }
     * 
     */
    public Factorial createFactorial() {
        return new Factorial();
    }

    /**
     * Create an instance of {@link Multiplicar }
     * 
     */
    public Multiplicar createMultiplicar() {
        return new Multiplicar();
    }

    /**
     * Create an instance of {@link Restar }
     * 
     */
    public Restar createRestar() {
        return new Restar();
    }

    /**
     * Create an instance of {@link MinimoResponse }
     * 
     */
    public MinimoResponse createMinimoResponse() {
        return new MinimoResponse();
    }

    /**
     * Create an instance of {@link DesEstandarResponse }
     * 
     */
    public DesEstandarResponse createDesEstandarResponse() {
        return new DesEstandarResponse();
    }

    /**
     * Create an instance of {@link FactorialResponse }
     * 
     */
    public FactorialResponse createFactorialResponse() {
        return new FactorialResponse();
    }

    /**
     * Create an instance of {@link DesEstandar }
     * 
     */
    public DesEstandar createDesEstandar() {
        return new DesEstandar();
    }

    /**
     * Create an instance of {@link MultiplicarResponse }
     * 
     */
    public MultiplicarResponse createMultiplicarResponse() {
        return new MultiplicarResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link SumarResponse }
     * 
     */
    public SumarResponse createSumarResponse() {
        return new SumarResponse();
    }

    /**
     * Create an instance of {@link Sumar }
     * 
     */
    public Sumar createSumar() {
        return new Sumar();
    }

    /**
     * Create an instance of {@link ParImparResponse }
     * 
     */
    public ParImparResponse createParImparResponse() {
        return new ParImparResponse();
    }

    /**
     * Create an instance of {@link Dividir }
     * 
     */
    public Dividir createDividir() {
        return new Dividir();
    }

    /**
     * Create an instance of {@link DividirResponse }
     * 
     */
    public DividirResponse createDividirResponse() {
        return new DividirResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link ParImpar }
     * 
     */
    public ParImpar createParImpar() {
        return new ParImpar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParImpar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "parImpar")
    public JAXBElement<ParImpar> createParImpar(ParImpar value) {
        return new JAXBElement<ParImpar>(_ParImpar_QNAME, ParImpar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dividir }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "dividir")
    public JAXBElement<Dividir> createDividir(Dividir value) {
        return new JAXBElement<Dividir>(_Dividir_QNAME, Dividir.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DividirResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "dividirResponse")
    public JAXBElement<DividirResponse> createDividirResponse(DividirResponse value) {
        return new JAXBElement<DividirResponse>(_DividirResponse_QNAME, DividirResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParImparResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "parImparResponse")
    public JAXBElement<ParImparResponse> createParImparResponse(ParImparResponse value) {
        return new JAXBElement<ParImparResponse>(_ParImparResponse_QNAME, ParImparResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sumar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "sumar")
    public JAXBElement<Sumar> createSumar(Sumar value) {
        return new JAXBElement<Sumar>(_Sumar_QNAME, Sumar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "sumarResponse")
    public JAXBElement<SumarResponse> createSumarResponse(SumarResponse value) {
        return new JAXBElement<SumarResponse>(_SumarResponse_QNAME, SumarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "multiplicarResponse")
    public JAXBElement<MultiplicarResponse> createMultiplicarResponse(MultiplicarResponse value) {
        return new JAXBElement<MultiplicarResponse>(_MultiplicarResponse_QNAME, MultiplicarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DesEstandar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "desEstandar")
    public JAXBElement<DesEstandar> createDesEstandar(DesEstandar value) {
        return new JAXBElement<DesEstandar>(_DesEstandar_QNAME, DesEstandar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FactorialResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "factorialResponse")
    public JAXBElement<FactorialResponse> createFactorialResponse(FactorialResponse value) {
        return new JAXBElement<FactorialResponse>(_FactorialResponse_QNAME, FactorialResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DesEstandarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "desEstandarResponse")
    public JAXBElement<DesEstandarResponse> createDesEstandarResponse(DesEstandarResponse value) {
        return new JAXBElement<DesEstandarResponse>(_DesEstandarResponse_QNAME, DesEstandarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinimoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "minimoResponse")
    public JAXBElement<MinimoResponse> createMinimoResponse(MinimoResponse value) {
        return new JAXBElement<MinimoResponse>(_MinimoResponse_QNAME, MinimoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplicar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "multiplicar")
    public JAXBElement<Multiplicar> createMultiplicar(Multiplicar value) {
        return new JAXBElement<Multiplicar>(_Multiplicar_QNAME, Multiplicar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Restar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "restar")
    public JAXBElement<Restar> createRestar(Restar value) {
        return new JAXBElement<Restar>(_Restar_QNAME, Restar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Factorial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "factorial")
    public JAXBElement<Factorial> createFactorial(Factorial value) {
        return new JAXBElement<Factorial>(_Factorial_QNAME, Factorial.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Promedio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "promedio")
    public JAXBElement<Promedio> createPromedio(Promedio value) {
        return new JAXBElement<Promedio>(_Promedio_QNAME, Promedio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FibonacciResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "fibonacciResponse")
    public JAXBElement<FibonacciResponse> createFibonacciResponse(FibonacciResponse value) {
        return new JAXBElement<FibonacciResponse>(_FibonacciResponse_QNAME, FibonacciResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromedioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "promedioResponse")
    public JAXBElement<PromedioResponse> createPromedioResponse(PromedioResponse value) {
        return new JAXBElement<PromedioResponse>(_PromedioResponse_QNAME, PromedioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "restarResponse")
    public JAXBElement<RestarResponse> createRestarResponse(RestarResponse value) {
        return new JAXBElement<RestarResponse>(_RestarResponse_QNAME, RestarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Minimo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "minimo")
    public JAXBElement<Minimo> createMinimo(Minimo value) {
        return new JAXBElement<Minimo>(_Minimo_QNAME, Minimo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fibonacci }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "fibonacci")
    public JAXBElement<Fibonacci> createFibonacci(Fibonacci value) {
        return new JAXBElement<Fibonacci>(_Fibonacci_QNAME, Fibonacci.class, null, value);
    }

}
