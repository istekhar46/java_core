import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// class First extends  Frame{
//     First(){
//         Button b = new Button("click me");
//         b.setBounds(30,100,80,30);
//         add(b);
//         setSize(300,300);
//         setLayout(null);
//         setVisible(true);
//     }
// }
class Myradio extends  Frame implements ItemListener {
    String msg = " ";
    CheckboxGroup cbg;
    Checkbox y, n;

    Myradio() {
        setLayout(new FlowLayout());
        cbg = new CheckboxGroup();
        y = new Checkbox("yes", cbg, true);
        n = new Checkbox("no", cbg, false);
        add(y);
        add(n);

        y.addItemListener(this);
        n.addItemListener(this);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }

    public void paint(Graphics g) {
        msg = "crrent selection:";
        msg+=cbg.getSelectedCheckbox().getLabel();
        g.drawString(msg,10,100);
    }
}

public class appletinclass {
    public static void main(String[] args) {
        // System.out.println("this is applet code");
        // First btn = new First();
        Myradio mr = new Myradio();
        mr.setTitle("Radio-Button");
        mr.setSize(400, 300);
        mr.setVisible(true);
    }
}


