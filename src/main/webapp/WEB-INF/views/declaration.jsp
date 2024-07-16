<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Health Declaration Form</title>
</head>
<body>
<h1>Tờ Khai Y Tế</h1>
<form:form action="declaration" modelAttribute="medicalDeclaration">
    <div>
        <table>
            <tr>
                <th><label for="fullName">Họ tên (ghi chữ IN HOA) (*):</label></th>
            </tr>
            <tr>
                <td><form:input path="fullName" id="fullName"/><br/></td>
            </tr>
        </table>
    </div>
    <div>
        <table>
            <th>
                <label for="birthDate">Ngày sinh (*):</label>
                <form:input path="birthDate" id="birthDate" type="date"/><br/>
            </th>
            <th>
                <label for="gender">Giới tính (*):</label>
                <form:select path="gender" id="gender">
                    <form:option value="Male">Nam</form:option>
                    <form:option value="Female">Nữ</form:option>
                </form:select><br/>
            </th>
            <th>
                <label for="nationality">Quốc tịch (*):</label>
                <form:input path="nationality" id="nationality"/><br/>
            </th>
        </table>
    </div>
    <label for="idNumber">Số hộ chiếu hoặc giấy tờ khác (*):</label>
    <form:input path="idNumber" id="idNumber"/><br/>

    <label for="transportationType">Phương tiện đi lại (*):</label>
    <form:radiobutton path="transportationType" value="Plane"/> Tàu bay
    <form:radiobutton path="transportationType" value="Ship"/> Tàu thuyền
    <form:radiobutton path="transportationType" value="Car"/> Ô tô
    <form:radiobutton path="transportationType" value="Other"/> Khác (ghi rõ):<br/>

    <label for="vehicleNumber">Số hiệu phương tiện:</label>
    <form:input path="vehicleNumber" id="vehicleNumber"/><br/>

    <label for="startDate">Ngày khởi hành (*):</label>
    <form:input path="startDate" id="startDate" type="date"/><br/>

    <label for="endDate">Ngày kết thúc (*):</label>
    <form:input path="endDate" id="endDate" type="date"/><br/>

    <label for="address">Địa chỉ liên lạc (*):</label>
    <form:input path="address" id="address"/><br/>

    <label for="email">Email:</label>
    <form:input path="email" id="email" type="email"/><br/>

    <h3>Trong vòng 14 ngày qua, Anh/Chị có thấy xuất hiện dấu hiệu nào sau đây không? (*)</h3>
    <label>Sốt:</label>
    <form:checkbox path="fever"/><br/>
    <label>Ho:</label>
    <form:checkbox path="cough"/><br/>
    <label>Khó thở:</label>
    <form:checkbox path="shortnessOfBreath"/><br/>
    <label>Mệt mỏi:</label>
    <form:checkbox path="fatigue"/><br/>

    <h3>Trong vòng 14 ngày qua, Anh/Chị có tiếp xúc với:</h3>
    <label>Người bệnh hoặc nghi ngờ, mắc bệnh COVID-19:</label>
    <form:checkbox path="contactWithInfected"/><br/>
    <label>Người từ nước ngoài có COVID-19:</label>
    <form:checkbox path="contactWithCountryOutside"/><br/>

    <button type="submit">Gửi tờ khai</button>
</form:form>
</body>
</html>
