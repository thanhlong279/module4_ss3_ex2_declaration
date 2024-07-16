package com.example.ex2_form_medical_declaration.controllers;

import com.example.ex2_form_medical_declaration.models.MedicalDeclaration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DeclarationController {
    @GetMapping("declaration")
    public String declarationForm(Model model) {
        model.addAttribute("medicalDeclaration", new MedicalDeclaration());
        return "declaration";
    }

    @PostMapping("declaration")
    public String declarationSubmit(@ModelAttribute("medicalDeclaration") MedicalDeclaration medicalDeclaration,
                                    Model model) {
        model.addAttribute("medicalDeclaration", medicalDeclaration);
        return "result";
    }
}
