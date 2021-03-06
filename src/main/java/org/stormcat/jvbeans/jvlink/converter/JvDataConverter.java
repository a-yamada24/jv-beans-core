/*
 * Copyright 2009-2011 the Stormcat Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.stormcat.jvbeans.jvlink.converter;

import org.stormcat.jvbeans.common.constants.FileExtension;
import org.stormcat.jvbeans.jvlink.analyze.JvBeansContainer;

/**
 * Jv-Dataの文字列を特定の形式に変換するコンバーターの抽象クラスです。
 * @author a.yamada
 * @since 0.3
 * 
 */
public abstract class JvDataConverter {

    /** 出力形式 */
    protected FileExtension outputType;
    
    /**
     * 
     * コンストラクタ
     * @param outputType 出力形式
     */
    protected JvDataConverter(FileExtension outputType) {
        this.outputType = outputType;
    }
    
    /**
     * JV-Dataを特定のの出力形式に変換した文字列を返します。 
     * @param container {@link JvBeansContainer}
     * @param data 変換対象文字列 
     * @return 変換済文字列
     */
    public abstract String convert(JvBeansContainer container, String data);
    
}
