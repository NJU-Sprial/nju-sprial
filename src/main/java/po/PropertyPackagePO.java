package po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * Created by CYF on 2017/9/3.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertyPackagePO {
    private String pname;
    private String packageNumber;
    private int propertyNum;
    private LocalDate packageDate;
    private double packageCapital;
    private double packageRate;

}
