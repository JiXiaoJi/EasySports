package com.rayhahah.easysports.bean.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;

/**
 * ┌───┐ ┌───┬───┬───┬───┐ ┌───┬───┬───┬───┐ ┌───┬───┬───┬───┐ ┌───┬───┬───┐
 * │Esc│ │ F1│ F2│ F3│ F4│ │ F5│ F6│ F7│ F8│ │ F9│F10│F11│F12│ │P/S│S L│P/B│ ┌┐    ┌┐    ┌┐
 * └───┘ └───┴───┴───┴───┘ └───┴───┴───┴───┘ └───┴───┴───┴───┘ └───┴───┴───┘ └┘    └┘    └┘
 * ┌──┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───────┐┌───┬───┬───┐┌───┬───┬───┬───┐
 * │~`│! 1│@ 2│# 3│$ 4│% 5│^ 6│& 7│* 8│( 9│) 0│_ -│+ =│ BacSp ││Ins│Hom│PUp││N L│ / │ * │ - │
 * ├──┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─────┤├───┼───┼───┤├───┼───┼───┼───┤
 * │Tab │ Q │ W │ E │ R │ T │ Y │ U │ I │ O │ P │{ [│} ]│ | \ ││Del│End│PDn││ 7 │ 8 │ 9 │   │
 * ├────┴┬──┴┬──┴┬──┴┬──┴┬──┴┬──┴┬──┴┬──┴┬──┴┬──┴┬──┴┬──┴─────┤└───┴───┴───┘├───┼───┼───┤ + │
 * │Caps │ A │ S │ D │ F │ G │ H │ J │ K │ L │: ;│" '│ Enter  │             │ 4 │ 5 │ 6 │   │
 * ├─────┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴────────┤    ┌───┐    ├───┼───┼───┼───┤
 * │Shift  │ Z │ X │ C │ V │ B │ N │ M │< ,│> .│? /│  Shift   │    │ ↑ │    │ 1 │ 2 │ 3 │   │
 * ├────┬──┴─┬─┴──┬┴───┴───┴───┴───┴───┴──┬┴───┼───┴┬────┬────┤┌───┼───┼───┐├───┴───┼───┤ E││
 * │Ctrl│Ray │Alt │         Space         │ Alt│code│fuck│Ctrl││ ← │ ↓ │ → ││   0   │ . │←─┘│
 * └────┴────┴────┴───────────────────────┴────┴────┴────┴────┘└───┴───┴───┘└───────┴───┴───┘
 *
 * @author Rayhahah
 * @time 2017/7/20
 * @tips 这个类是Object的子类
 * @fuction 本地数据库用户表
 */
@Entity
public class LocalUser {

    @Unique
    private String user_name;
    @NotNull
    private String password;
    @NotNull
    private String screen_name;
    @NotNull
    private String tel;

    private String hupu_user_name;
    private String hupu_password;
    private String hupu_screen_name;

    private String is_day_theme;

    @Generated(hash = 1250608706)
    public LocalUser(String user_name, @NotNull String password, @NotNull String screen_name,
            @NotNull String tel, String hupu_user_name, String hupu_password,
            String hupu_screen_name, String is_day_theme) {
        this.user_name = user_name;
        this.password = password;
        this.screen_name = screen_name;
        this.tel = tel;
        this.hupu_user_name = hupu_user_name;
        this.hupu_password = hupu_password;
        this.hupu_screen_name = hupu_screen_name;
        this.is_day_theme = is_day_theme;
    }

    @Generated(hash = 173344742)
    public LocalUser() {
    }

    public String getUser_name() {
        return this.user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getScreen_name() {
        return this.screen_name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getHupu_user_name() {
        return this.hupu_user_name;
    }

    public void setHupu_user_name(String hupu_user_name) {
        this.hupu_user_name = hupu_user_name;
    }

    public String getHupu_password() {
        return this.hupu_password;
    }

    public void setHupu_password(String hupu_password) {
        this.hupu_password = hupu_password;
    }

    public String getHupu_screen_name() {
        return this.hupu_screen_name;
    }

    public void setHupu_screen_name(String hupu_screen_name) {
        this.hupu_screen_name = hupu_screen_name;
    }

    public String getIs_day_theme() {
        return this.is_day_theme;
    }

    public void setIs_day_theme(String is_day_theme) {
        this.is_day_theme = is_day_theme;
    }

}
