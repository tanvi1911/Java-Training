import com.globalpayex.StudentOps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StudentOpsTest {

    @Test
    void studentDetails(){
        var name = "Tanvi";
        var gender = 'F';
        var age = 21;
        var marks = 84;
        var expected = "Name: Tanvi\nGender: F\nAge: 21\nMarks: 84";
        var actual = StudentOps.studentDetails(name, gender, age, marks);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "71,A",
            "70,A",
            "64,B",
            "60,B",
            "58,C",
            "50,C",
            "29,F",
            "39,F",
            "200,I",
            "-71,I",
    })

    void TestGrade(int mark, char expected1){
        var actual1 = StudentOps.checkGrade(mark);
        assertEquals(expected1, actual1);
    }
}