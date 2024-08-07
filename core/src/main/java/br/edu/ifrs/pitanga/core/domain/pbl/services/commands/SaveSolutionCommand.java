package br.edu.ifrs.pitanga.core.domain.pbl.services.commands;

import java.util.UUID;

import br.edu.ifrs.pitanga.core.domain.pbl.Solution;
import br.edu.ifrs.pitanga.core.domain.pbl.vo.SolutionId;

public record SaveSolutionCommand(
    String code,
    String language,
    UUID challengeId,
    String submitterId
) {
    public Solution toEntity() {
        SolutionId id = SolutionId.builder()
            .challengeId(challengeId())
            .submitterId(submitterId)
            .build();
        return Solution.builder()
            .language(language())
            .code(code())
            .id(id)
            .build();
    }
}
