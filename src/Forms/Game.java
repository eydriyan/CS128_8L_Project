/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Callbacks.IGameCallback;
import GameClasses.Vector2;
import GameClasses.Enemy;
import GameClasses.GameObject;
import GameClasses.Goal;
import GameClasses.Player;
import GameClasses.Wall;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author hp
 */
public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    
    private IGameCallback callback;
    
    private Player player;
    private Goal goal;
    private ArrayList<Wall> walls;
    private ArrayList<Enemy> enemies;
    
    private int Duration;
    private int Points;
    
    private Vector2 EDGE;
    
    private Timer gameTimer, secGameTimer, gameObjUpdateCoords, gameObjUpdateLocation;
    
    private int timeSec;
    
    public Game(int _duration) {
        initComponents();
        
        // Set Game Params
        this.Duration = _duration;
        this.Points = 0;
        
        EDGE = new Vector2(
            this.getSize().width - 40,
            this.getSize().height - 95
        );
        
        // Initialize Components
        InitializeGameComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WallObj1 = new javax.swing.JButton();
        WallObj2 = new javax.swing.JButton();
        WallObj3 = new javax.swing.JButton();
        WallObj4 = new javax.swing.JButton();
        WallObj5 = new javax.swing.JButton();
        WallObj6 = new javax.swing.JButton();
        WallObj7 = new javax.swing.JButton();
        WallObj8 = new javax.swing.JButton();
        EnemyObj1 = new javax.swing.JButton();
        EnemyObj2 = new javax.swing.JButton();
        EnemyObj3 = new javax.swing.JButton();
        EnemyObj4 = new javax.swing.JButton();
        PlayerObj = new javax.swing.JButton();
        GoalObj = new javax.swing.JButton();
        GameMenuBar = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        EndGameMenuItem = new javax.swing.JMenuItem();
        GameMenu = new javax.swing.JMenu();
        s20TimerMenuItem = new javax.swing.JMenuItem();
        s40TimerMenuItem = new javax.swing.JMenuItem();
        s60TimerMenuItem = new javax.swing.JMenuItem();
        HelpMenu = new javax.swing.JMenu();
        GameHelpMenuItem = new javax.swing.JMenuItem();
        VersionMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));
        setSize(new java.awt.Dimension(500, 500));

        WallObj1.setBackground(new java.awt.Color(153, 153, 153));

        WallObj2.setBackground(new java.awt.Color(153, 153, 153));

        WallObj3.setBackground(new java.awt.Color(153, 153, 153));

        WallObj4.setBackground(new java.awt.Color(153, 153, 153));

        WallObj5.setBackground(new java.awt.Color(153, 153, 153));

        WallObj6.setBackground(new java.awt.Color(153, 153, 153));

        WallObj7.setBackground(new java.awt.Color(153, 153, 153));

        WallObj8.setBackground(new java.awt.Color(153, 153, 153));

        EnemyObj1.setBackground(new java.awt.Color(255, 0, 51));

        EnemyObj2.setBackground(new java.awt.Color(255, 0, 51));

        EnemyObj3.setBackground(new java.awt.Color(255, 0, 51));

        EnemyObj4.setBackground(new java.awt.Color(255, 0, 51));

        PlayerObj.setBackground(new java.awt.Color(0, 204, 255));
        PlayerObj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PlayerObjKeyPressed(evt);
            }
        });

        GoalObj.setBackground(new java.awt.Color(0, 255, 0));

        FileMenu.setText("File");

        EndGameMenuItem.setText("End Game");
        EndGameMenuItem.setToolTipText("");
        EndGameMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndGameMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(EndGameMenuItem);

        GameMenuBar.add(FileMenu);

        GameMenu.setText("Game");

        s20TimerMenuItem.setText("20 second Timer");
        s20TimerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s20TimerMenuItemActionPerformed(evt);
            }
        });
        GameMenu.add(s20TimerMenuItem);

        s40TimerMenuItem.setText("40 second Timer");
        s40TimerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s40TimerMenuItemActionPerformed(evt);
            }
        });
        GameMenu.add(s40TimerMenuItem);

        s60TimerMenuItem.setText("60 second Timer");
        s60TimerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s60TimerMenuItemActionPerformed(evt);
            }
        });
        GameMenu.add(s60TimerMenuItem);

        GameMenuBar.add(GameMenu);

        HelpMenu.setText("Help");

        GameHelpMenuItem.setText("Game Help");
        GameHelpMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GameHelpMenuItemActionPerformed(evt);
            }
        });
        HelpMenu.add(GameHelpMenuItem);

        VersionMenuItem.setText("Version");
        VersionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VersionMenuItemActionPerformed(evt);
            }
        });
        HelpMenu.add(VersionMenuItem);

        GameMenuBar.add(HelpMenu);

        setJMenuBar(GameMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(EnemyObj2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(WallObj2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(WallObj7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(WallObj5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(EnemyObj1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(WallObj3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(GoalObj, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(WallObj4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EnemyObj3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(WallObj8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(EnemyObj4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(WallObj6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(101, 101, 101))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(PlayerObj, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(WallObj1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(WallObj8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(EnemyObj3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(WallObj1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(WallObj6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WallObj3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EnemyObj4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(WallObj4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(WallObj5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(EnemyObj1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PlayerObj, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EnemyObj2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112))
                            .addComponent(WallObj2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GoalObj, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(WallObj7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 356, Short.MAX_VALUE)))
                .addGap(36, 36, 36))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EndGameMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndGameMenuItemActionPerformed
        // TODO add your handling code here:

        GameEnd();
    }//GEN-LAST:event_EndGameMenuItemActionPerformed

    private void s20TimerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s20TimerMenuItemActionPerformed
        // TODO add your handling code here:

        // Relaunch App with new settings
        StopAllTimers();
        callback.RestartGame(20_000);
    }//GEN-LAST:event_s20TimerMenuItemActionPerformed

    private void s40TimerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s40TimerMenuItemActionPerformed
        // TODO add your handling code here:

        // Relaunch App with new settings
        StopAllTimers();
        callback.RestartGame(40_000);
    }//GEN-LAST:event_s40TimerMenuItemActionPerformed

    private void s60TimerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s60TimerMenuItemActionPerformed
        // TODO add your handling code here:

        // Relaunch App with new settings
        StopAllTimers();
        callback.RestartGame(60_000);
    }//GEN-LAST:event_s60TimerMenuItemActionPerformed

    private void GameHelpMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GameHelpMenuItemActionPerformed
        // TODO add your handling code here:
        String helpStr = "";

        helpStr += " This is A Game \n\n";
        helpStr += " Use Arrow Keys To Move \n";
        helpStr += " Hover Mouse To Moving Wall to Make it Stop \n";
        helpStr += " Touch the Green Button To Earn Points \n";

        JOptionPane.showMessageDialog(rootPane, helpStr);
    }//GEN-LAST:event_GameHelpMenuItemActionPerformed

    private void VersionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VersionMenuItemActionPerformed
        // TODO add your handling code here:
        String verStr = "A Game v1.0.0";
        JOptionPane.showMessageDialog(rootPane, verStr);
    }//GEN-LAST:event_VersionMenuItemActionPerformed

    private void PlayerObjKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PlayerObjKeyPressed
        // TODO add your handling code here:

        if (!player.isAllowMovement()) return;
        
        int keyCode = evt.getKeyCode();
        int movSpd = player.getMoveSpeed();

        int x = player.getSwingObject().getLocation().x;
        int y = player.getSwingObject().getLocation().y;

        switch (keyCode) {
            case KeyEvent.VK_W:
            case KeyEvent.VK_UP:
                y -= movSpd;
                break;
            case KeyEvent.VK_S:
            case KeyEvent.VK_DOWN:
                y += movSpd;
                break;
            case KeyEvent.VK_A:
            case KeyEvent.VK_LEFT:
                x -= movSpd;
                break;
            case KeyEvent.VK_D:
            case KeyEvent.VK_RIGHT:
                x += movSpd;
                break;
            default:
                break;
        }

        player.SetLatestMoveCoords(new Vector2(
                player.getSwingObject().getLocation().x - x,
                player.getSwingObject().getLocation().y - y
            )
        );

        player.getSwingObject().setLocation(x, y);

        // Check For Collisions
        ScreenEdgeCollision(player);
        PlayerCollisions();
    }//GEN-LAST:event_PlayerObjKeyPressed

    private void InitializeGameComponents() {
        // ** Players ** //
        player = new Player(10, PlayerObj, 5);
        goal = new Goal(GoalObj, new Vector2(0, 0), 10);
        
        walls = new ArrayList<>(Arrays.asList(new Wall(WallObj1, new Vector2(0, -5)),
                new Wall(WallObj2, new Vector2(0, 5)),
                new Wall(WallObj3, new Vector2(5, 0)),
                new Wall(WallObj4, new Vector2(5, 0)),
                new Wall(WallObj5, new Vector2(0, 5)),
                new Wall(WallObj6, new Vector2(0, 5)),
                new Wall(WallObj7, new Vector2(-5, 0)),
                new Wall(WallObj8, new Vector2(5, 0))
        ));
        
        for (Wall wall : walls) {
            wall.getSwingObject().addMouseListener(GetNewMouseListener(wall));
        }
        
        enemies = new ArrayList<>(Arrays.asList(new Enemy(1, EnemyObj1, new Vector2(0, 5)),
                new Enemy(1, EnemyObj2, new Vector2(-5, 0)),
                new Enemy(1, EnemyObj3, new Vector2(0, -5)),
                new Enemy(1, EnemyObj4, new Vector2(5, 0))
        ));
        
        for (Enemy enemy : enemies) {
            enemy.getSwingObject().addMouseListener(GetNewMouseListener(enemy));
        }
        
        
        // ** Initialize-Timers ** //
        InitializeTimers();
        
        
        // ** Run-Timers ** //
        gameTimer.start();
        secGameTimer.start();
        gameObjUpdateCoords.start();
        gameObjUpdateLocation.start();
    }
    
    private void InitializeTimers() {
        gameTimer = new Timer(Duration, evt -> {
            StopAllTimers();
            
            GameEnd();
        });
        
        secGameTimer = new Timer(1000, evt -> {
            timeSec += 1;
            System.out.println(timeSec);
        });
        
        gameObjUpdateCoords = new Timer(2000, evt -> {
            for (Wall wall : walls) {
                wall.getMoveCoords().x *= -1;
                wall.getMoveCoords().y *= -1;
            }
        });
        
        gameObjUpdateLocation = new Timer(100, evt -> {
            for (Wall wall : walls) {
                wall.getSwingObject().setLocation(
                    wall.getSwingObject().getLocation().x + wall.getMoveCoords().x,
                    wall.getSwingObject().getLocation().y + wall.getMoveCoords().y
                );
                
                ScreenEdgeCollision(wall);
                WallCollisions(wall);
            }
            
            for (Enemy enemy : enemies) {
                enemy.getSwingObject().setLocation(
                    enemy.getSwingObject().getLocation().x + enemy.getMoveCoords().x,
                    enemy.getSwingObject().getLocation().y + enemy.getMoveCoords().y
                );
                
                ScreenEdgeCollision(enemy);
                EnemyCollisions(enemy);
            }
        });
    }
    
    private void StopAllTimers() {
        gameTimer.stop();
        secGameTimer.stop();
        gameObjUpdateCoords.stop();
        gameObjUpdateLocation.stop();
    }
    
    private void GameEnd() {
        StopAllTimers();
        
        callback.GameFinished(Duration/1000, Points);
    }
    
    // =========================================================================
    
    private void ScreenEdgeCollision(GameObject obj) {
        if (obj.getSwingObject().getBounds().getMinX() < 0) {
            obj.getSwingObject().setLocation(
                    EDGE.x,
                    obj.getSwingObject().getLocation().y
            );
        }
        
        if (obj.getSwingObject().getBounds().getMaxX() > this.getSize().width) {
            obj.getSwingObject().setLocation(
                    5,
                    obj.getSwingObject().getLocation().y
            );
        }
        
        if (obj.getSwingObject().getBounds().getMaxY() < 5) {
            obj.getSwingObject().setLocation(
                    obj.getSwingObject().getLocation().x,
                    EDGE.y
            );
        }
        
        if (obj.getSwingObject().getBounds().getMinY() > this.getSize().height-90) {
            obj.getSwingObject().setLocation(
                    obj.getSwingObject().getLocation().x,
                    2
            );
        }
    }
    
    private void PlayerCollisions() {
        if (player.getSwingObject().getBounds().intersects(goal.getSwingObject().getBounds())) {
            // Add Points To Player
            Points += goal.getPoints();
            
            // Select Random Coord within Frame
            GoalObj.setLocation(
                    new Random().nextInt(EDGE.x),
                    new Random().nextInt(EDGE.y)
            );
        }
    }
    
    private void EnemyCollisions(Enemy enemy) {
        while (PlayerObj.getBounds().intersects(enemy.getSwingObject().getBounds())) {
            // Damage Player
            player.TakeDamage(
                enemy.getDamage()
            );
            
            // If Player Health <= 0, END GAME
            if (player.getHealth() <= 0) GameEnd();
            
            // Randomized Player Location
            PlayerObj.setLocation(
                    new Random().nextInt(this.getSize().width-50),
                    new Random().nextInt(this.getSize().height-100)
            );
        }
    }
    
    private void WallCollisions(Wall wall) {
        while (player.getSwingObject().getBounds().intersects(wall.getSwingObject().getBounds())) {
            // Undo Last Move
            // Prevent Player From Moving If On Top Of Wall (Its A Feature Not A Bug)
            player.getSwingObject().setLocation(
                player.getSwingObject().getLocation().x + wall.getMoveCoords().x,
                player.getSwingObject().getLocation().y + wall.getMoveCoords().y
            );
            
            player.setAllowMovement(false);
        }
        
        player.setAllowMovement(true);
    }
    
    // =========================================================================
    
    private MouseListener GetNewMouseListener(GameObject obj) {
        return new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    //
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    //
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    //
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    obj.setMoveCoords(new Vector2(0, 0));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    obj.ResetMoveCoords();
                }
            };
    }
    
    // =========================================================================
    
    public void SetCallback(IGameCallback _callback) {
        this.callback = _callback;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EndGameMenuItem;
    private javax.swing.JButton EnemyObj1;
    private javax.swing.JButton EnemyObj2;
    private javax.swing.JButton EnemyObj3;
    private javax.swing.JButton EnemyObj4;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenuItem GameHelpMenuItem;
    private javax.swing.JMenu GameMenu;
    private javax.swing.JMenuBar GameMenuBar;
    private javax.swing.JButton GoalObj;
    private javax.swing.JMenu HelpMenu;
    private javax.swing.JButton PlayerObj;
    private javax.swing.JMenuItem VersionMenuItem;
    private javax.swing.JButton WallObj1;
    private javax.swing.JButton WallObj2;
    private javax.swing.JButton WallObj3;
    private javax.swing.JButton WallObj4;
    private javax.swing.JButton WallObj5;
    private javax.swing.JButton WallObj6;
    private javax.swing.JButton WallObj7;
    private javax.swing.JButton WallObj8;
    private javax.swing.JMenuItem s20TimerMenuItem;
    private javax.swing.JMenuItem s40TimerMenuItem;
    private javax.swing.JMenuItem s60TimerMenuItem;
    // End of variables declaration//GEN-END:variables
}