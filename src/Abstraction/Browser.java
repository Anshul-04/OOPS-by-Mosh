package Abstraction;

// reduceing Coupling example
public class Browser {

    public void navigate(String address){
        String ip = findIpAddress(address);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    private String sendHttpRequest(String ip) {
        return "<html> " + ip +" </html>";
    }

    private String findIpAddress(String address) {
        return address;
    }
}
/*
We are making sendHttpRequest() and findIpAddress() method private because it is the implementation and
user don't need to see or access these methods.It also reduces the Coupling of classes.
So in Main class when we make Browser obj ,our main class is less dependent on Browser.
so if in future we do any modification in Browser class or add any new parameter in methods in browser class
it did not affect the Main class due to coupling .
It is the way of OOP ,and doing abstraction and Interface by hiding the implementation

 */
