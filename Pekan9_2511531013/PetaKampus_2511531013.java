package Pekan9_2511531013;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class PetaKampus_2511531013 extends JFrame {

    private final Map<String, java.util.List<String>> graph_1013 = new LinkedHashMap<>();
    private final Map<String, Point> posisi_1013 = new HashMap<>();

    private final Set<String> visited_1013 = new LinkedHashSet<>();
    private final java.util.List<String> path_1013 = new ArrayList<>();

    private JComboBox<String> startBox_1013;
    private JComboBox<String> goalBox_1013;
    private JTextArea hasil_1013;
    private JPanel panel_1013;

    public PetaKampus_2511531013() {
        setTitle("Peta Kampus BFS DFS - 2511531013");
        setSize(900,650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        inisialisasiGraph_1013();

        startBox_1013 = new JComboBox<>(graph_1013.keySet().toArray(new String[0]));
        goalBox_1013 = new JComboBox<>(graph_1013.keySet().toArray(new String[0]));
        startBox_1013.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        goalBox_1013.setFont(new Font("Times New Roman", Font.PLAIN, 14));

        JButton bfs = new JButton("BFS");
        JButton dfs = new JButton("DFS");
        JButton reset = new JButton("RESET");
        Font fontButton = new Font("Times New Roman", Font.BOLD, 14);
        bfs.setFont(fontButton);
        dfs.setFont(fontButton);
        reset.setFont(fontButton);
        
        JPanel atas = new JPanel();
        JLabel lblAwal = new JLabel("Lokasi Awal");
        JLabel lblTujuan = new JLabel("Lokasi Tujuan");

        lblAwal.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblTujuan.setFont(new Font("Times New Roman", Font.BOLD, 14));

        atas.add(lblAwal);
        atas.add(startBox_1013);
        atas.add(lblTujuan);
        atas.add(goalBox_1013);
        atas.add(bfs);
        atas.add(dfs);
        atas.add(reset);

        hasil_1013 = new JTextArea(8,40);
        hasil_1013.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        hasil_1013.setEditable(false);

        panel_1013 = new JPanel(){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                for(String a:graph_1013.keySet()){
                    Point p1=posisi_1013.get(a);
                    for(String b:graph_1013.get(a)){
                        Point p2=posisi_1013.get(b);
                        g.setColor(Color.GRAY);
                        g.drawLine(p1.x,p1.y,p2.x,p2.y);
                    }
                }
                for(String n:graph_1013.keySet()){
                    Point p=posisi_1013.get(n);
                    g.setColor(path_1013.contains(n)?Color.ORANGE:visited_1013.contains(n)?Color.GREEN:Color.CYAN);
                    g.fillOval(p.x-20,p.y-20,40,40);
                    g.setColor(Color.BLACK);
                    g.setFont(new Font("Times New Roman", Font.BOLD, 12));
                    g.drawOval(p.x-20,p.y-20,40,40);
                    g.drawString(n,p.x-20,p.y+35);
                }
            }
        };

        add(atas,BorderLayout.NORTH);
        add(panel_1013,BorderLayout.CENTER);
        add(new JScrollPane(hasil_1013),BorderLayout.SOUTH);

        bfs.addActionListener(e->cariBFS_1013());
        dfs.addActionListener(e->cariDFS_1013());
        reset.addActionListener(e->resetGraph_1013());
    }

    private void tambahEdge(String a,String b){
        graph_1013.get(a).add(b);
        graph_1013.get(b).add(a);
    }

    private void inisialisasiGraph_1013(){
        String[] node={"Gerbang","Parkiran","Rektorat","Perpus","Fakultas Teknik","Fakultas Kedokteran","Masjid","Kantin","Labor","Lapangan"};
        int[][] pos={{60,250},{120,420},{220,150},{350,90},{550,90},{350,250},{220,520},{500,480},{700,180},{700,400}};
        for(int i=0;i<node.length;i++){
            graph_1013.put(node[i],new ArrayList<>());
            posisi_1013.put(node[i],new Point(pos[i][0],pos[i][1]));
        }
        tambahEdge("Gerbang","Parkiran");
        tambahEdge("Gerbang","Rektorat");
        tambahEdge("Parkiran","Masjid");
        tambahEdge("Parkiran","Lapangan");
        tambahEdge("Rektorat","Perpus");
        tambahEdge("Rektorat","Fakultas Kedokteran");
        tambahEdge("Perpus","Fakultas Teknik");
        tambahEdge("Perpus","Labor");
        tambahEdge("Fakultas Teknik","Labor");
        tambahEdge("Fakultas Teknik","Kantin");
        tambahEdge("Fakultas Kedokteran","Masjid");
        tambahEdge("Fakultas Kedokteran","Kantin");
        tambahEdge("Masjid","Kantin");
        tambahEdge("Kantin","Lapangan");
        tambahEdge("Labor","Lapangan");
    }

    private void cariBFS_1013(){
        proses(true);
    }
    private void cariDFS_1013(){
        proses(false);
    }

    private void proses(boolean bfs){
        visited_1013.clear();
        path_1013.clear();
        String start=(String)startBox_1013.getSelectedItem();
        String goal=(String)goalBox_1013.getSelectedItem();
        Map<String,String> parent=new HashMap<>();
        if(bfs){
            Queue<String> q=new LinkedList<>();
            q.add(start);visited_1013.add(start);parent.put(start,null);
            while(!q.isEmpty()){
                String c=q.poll();
                if(c.equals(goal))break;
                for(String n:graph_1013.get(c))
                    if(!visited_1013.contains(n)){
                        visited_1013.add(n);parent.put(n,c);q.add(n);
                    }
            }
        }else{
            Stack<String> s=new Stack<>();
            s.push(start);parent.put(start,null);
            while(!s.isEmpty()){
                String c=s.pop();
                if(visited_1013.contains(c))continue;
                visited_1013.add(c);
                if(c.equals(goal))break;
                java.util.List<String> tet=graph_1013.get(c);
                for(int i=tet.size()-1;i>=0;i--){
                    String n=tet.get(i);
                    if(!visited_1013.contains(n)){
                        if(!parent.containsKey(n))parent.put(n,c);
                        s.push(n);
                    }
                }
            }
        }
        if(parent.containsKey(goal)){
            String x=goal;
            while(x!=null){
                path_1013.add(0,x);
                x=parent.get(x);
            }
        }
        hasil_1013.setText((bfs?"BFS":"DFS")+"\nJalur : "+String.join(" -> ",path_1013)+
                "\nNode dikunjungi : "+visited_1013+
                "\nJumlah node : "+visited_1013.size());
        panel_1013.repaint();
    }

    private void resetGraph_1013(){
        visited_1013.clear();
        path_1013.clear();
        hasil_1013.setText("");
        panel_1013.repaint();
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()->new PetaKampus_2511531013().setVisible(true));
    }
}
