module ru.vsu.cs.dorofeyeva_s_v.rasterization {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.vsu.cs.dorofeyeva_s_v.rasterization to javafx.fxml;
    exports ru.vsu.cs.dorofeyeva_s_v.rasterization;
}